package com.personnal.wxBackground.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.TemplateExportParams;
import com.personnal.wxBackground.service.ExpertRatingSheetService;
import com.personnal.wxBackground.service.ICaptchaService;
import com.personnal.wxBackground.utils.Captcha;
import com.personnal.wxBackground.utils.JwtUtil;
import com.personnal.wxBackground.utils.ResultResponseUtils;
import com.personnal.wxBackground.wxEnum.RedisPrefix;
import com.personnal.wxBackground.wxEnum.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName LoginController
 * @Description test
 * @Date 2022/4/6 21:37
 * @Author by lvdong
 **/
@RestController
@Slf4j
@RequestMapping("login")
public class LoginController {

    @Autowired
    ICaptchaService iCaptchaService;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    ExpertRatingSheetService expertRatingSheetService;



    @Autowired
    private com.personnal.wxBackground.config.PhoneConfigProperties phoneConfigProperties;

    @RequestMapping("login")
    public ResultResponseUtils login(String code){
        String key = phoneConfigProperties.getNum();
        String valCode = iCaptchaService.getToRedis(key);
        if(StringUtils.isEmpty(code) || !code.equals(valCode)){
            ResultResponseUtils resultResponseUtils = ResultResponseUtils.fail();
            resultResponseUtils.setMsg("验证码错误");
            return resultResponseUtils;
        }
        String token = JwtUtil.sign(key);
        String tokenKey = RedisPrefix.TOKEN.getCode()+key;
        stringRedisTemplate.opsForValue().set(token,tokenKey,3600, TimeUnit.SECONDS);
        return ResultResponseUtils.builder().code(ResultCode.SUCCESS.getCode()).msg(ResultCode.SUCCESS.getMsg()).data(token).build();
    }

    @RequestMapping("ver/code")
    public ResultResponseUtils verCode(HttpServletResponse resp){
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            Captcha captcha = Captcha.getInstance();
            //图形验证码code 存储于redis中
            String code = captcha.generateCheckcode();
            log.info("生成登录验证码：{}", code);
            String key = phoneConfigProperties.getNum();
            iCaptchaService.saveToRedis(key, code);
            return ResultResponseUtils.success();
        } catch (Exception e) {
            log.error("获取验证码错误：{}",e);
            return ResultResponseUtils.fail();
        }
    }

    @RequestMapping("export")
    public void export(HttpServletRequest request,HttpServletResponse response){
//        String token = request.getHeader("token");
//        if(!stringRedisTemplate.hasKey(token)){
//            ResultResponseUtils resultResponseUtils = ResultResponseUtils.fail();
//            resultResponseUtils.setMsg("token已过期");
//            return resultResponseUtils;
//        }

        Map<String, Object> map = new HashMap<>();
        map.put("list", expertRatingSheetService.export());
        TemplateExportParams params = new TemplateExportParams("templates/dis_export_templates.xlsx");
        Workbook workbook = ExcelExportUtil.exportExcel(params, map);
        //以流的形式导出
        ServletOutputStream outputStream = null;
        try {
            //流形式
            response.setHeader("content-type", "application/vnd.ms-excel");
            //防止中文乱码
            response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode("导出专家分配汇总表.xlsx", "UTF-8"));
            outputStream = response.getOutputStream();
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != outputStream) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @RequestMapping("import/file")
    public ResultResponseUtils importFile(HttpServletRequest request, HttpServletResponse response, MultipartFile file){
//        String token = request.getHeader("token");
//        if(!stringRedisTemplate.hasKey(token)){
//            ResultResponseUtils resultResponseUtils = ResultResponseUtils.fail();
//            resultResponseUtils.setMsg("token已过期");
//            return resultResponseUtils;
//        }
        ResultResponseUtils result = expertRatingSheetService.excute(file);
        return result;
    }
}
