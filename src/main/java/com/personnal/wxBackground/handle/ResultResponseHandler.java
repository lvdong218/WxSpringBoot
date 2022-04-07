package com.personnal.wxBackground.handle;

import com.personnal.wxBackground.utils.ResultResponseUtils;
import com.personnal.wxBackground.wxEnum.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName ResultResponseHandler
 * @Description 返回结果切面类
 * @Date 2022/4/6 22:19
 * @Author by lvdong
 **/
@ControllerAdvice
public class ResultResponseHandler<V> implements ResponseBodyAdvice<V> {
    private static final Logger logger = LoggerFactory.getLogger(ResultResponseHandler.class);
    private static final String RESULT_RESPONSE_ANN = "RESULT_RESPONSE_ANN";
    /**
     * 是否包含注解
     * @param methodParameter
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        ServletRequestAttributes serverHttpRequest = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = serverHttpRequest.getRequest();
        ResultResponseUtils resultResponseUtils = (ResultResponseUtils) request.getAttribute(RESULT_RESPONSE_ANN);
        System.out.println(resultResponseUtils);
        System.out.println(resultResponseUtils==null);
        return resultResponseUtils ==null?false:true;
    }

    @Override
    public V beforeBodyWrite(V v, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        logger.info("返回body格式化");
        System.out.println("回写前调用");
        return (V) new ResultResponseUtils(ResultCode.SUCCESS,v);
    }


}
