package com.personnal.wxBackground.controller;

import com.personnal.wxBackground.annotate.ResultResponse;
import com.personnal.wxBackground.bean.WxRole;
import com.personnal.wxBackground.service.WxRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName WxRoleController
 * @Description 后台角色controller
 * @Date 2022/4/13 23:15
 * @Author by lvdong
 **/
@RestController
@RequestMapping("wx/role")
public class WxRoleController {
    @Autowired
    WxRoleService wxRoleService;
    @RequestMapping("query/id")
    public List<WxRole> queryById(){
        return wxRoleService.getRole(1L);
    }

    /**
     * 增加用户角色
     * @param wxRole
     * @param result
     * @return
     */
    @RequestMapping("add/role")
    public  List<String> addRole(@Validated @RequestBody WxRole wxRole, BindingResult result){
        List<String> errors = new ArrayList<>();
        if (result.hasErrors()){
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError error : allErrors) {
                errors.add(error.getDefaultMessage());
            }
        }
        return errors;
//        return wxRole;
    }
}
