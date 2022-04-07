package com.personnal.wxBackground.config;

import com.personnal.wxBackground.handle.ResultResponseHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @ClassName ControllerConfig
 * @Description 装配handler类
 * @Date 2022/4/7 8:01
 * @Author by lvdong
 **/
@Configuration
public class ControllerConfig extends WebMvcConfigurationSupport {

    @Autowired
    ResultResponseHandlerInterceptor resultResponseHandlerInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.resultResponseHandlerInterceptor).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
