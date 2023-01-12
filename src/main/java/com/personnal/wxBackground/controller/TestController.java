package com.personnal.wxBackground.controller;

import com.personnal.wxBackground.annotate.ResultResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestController
 * @Description test
 * @Date 2022/4/6 21:37
 * @Author by lvdong
 **/
@RestController
@ResultResponse
@RequestMapping("test")
public class TestController {
    @RequestMapping("first/result")
    public String test(){
//        ResultResponse resultResponse = ResultResponse.success();
        List<String> ad = new ArrayList<String>();
        ad.add("张三");
        ad.add("李四");
        ad.add("王麻子");
        ad.add("卡萨个");
        int i=1;
//        i=1/0;0

        return "ad";

    }

    public static void main(String[] args) {
        try {
            Socket sock = new Socket("127.0.0.1",2500 );
            byte[] bys = new byte[5];
            bys[0]=0;
            bys[1]=1;
            bys[2]=2;
            bys[3]=3;
            bys[4]=4;
//            bys[5]=5;
            OutputStream out = sock.getOutputStream();
            out.write(bys);
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
