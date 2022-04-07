package com.personnal.wxBackground.handle;

import com.personnal.wxBackground.annotate.ResultResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @ClassName ResultResponseHandler
 * @Description TODO
 * @Date 2022/4/6 22:08
 * @Author by lvdong
 **/
@Component
public class ResultResponseHandlerInterceptor implements HandlerInterceptor {
    private static final String RESULT_RESPONSE_ANN = "RESULT_RESPONSE_ANN";
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(handler instanceof HandlerMethod){
            final HandlerMethod handlerMethod = (HandlerMethod) handler;
            final Class classz = ((HandlerMethod) handler).getBean().getClass();
            final Method method = handlerMethod.getMethod();
            //判断是否在类上增加注解
            if(classz.isAnnotationPresent(ResultResponse.class)){
                request.setAttribute(RESULT_RESPONSE_ANN,classz.getAnnotation(ResultResponse.class));
            } else if(method.isAnnotationPresent(ResultResponse.class)){
                request.setAttribute(RESULT_RESPONSE_ANN,method.getAnnotation(ResultResponse.class));
            }
        }
        return true;
    }
}
