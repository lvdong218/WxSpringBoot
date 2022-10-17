package com.personnal.wxBackground.handle;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName GlobalExceptionHandler
 * @Description 全局异常处理
 * @Date 2022/4/8 22:29
 * @Author by lvdong
 **/
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ModelAndView handlerException(Exception e){
        log.error("全局捕获异常",e);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("errorMessage","发生异常-请联系管理员");
        return modelAndView;
    }
}
