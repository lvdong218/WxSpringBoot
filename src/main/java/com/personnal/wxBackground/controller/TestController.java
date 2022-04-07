package com.personnal.wxBackground.controller;

import com.personnal.wxBackground.annotate.ResultResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestController
 * @Description test
 * @Date 2022/4/6 21:37
 * @Author by lvdong
 **/
@RestController
@RequestMapping("test")
@ResultResponse
public class TestController {
    @RequestMapping("first/result")

    public List<String> test(){
//        ResultResponse resultResponse = ResultResponse.success();
        List<String> ad = new ArrayList<String>();
        ad.add("张三");
        ad.add("李四");
        ad.add("王麻子");
        ad.add("卡萨个");
        return ad;

    }
}
