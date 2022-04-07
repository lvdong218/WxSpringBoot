package com.personnal.wxBackground.annotate;

import java.lang.annotation.*;

/**
 * @ClassName ResultResponse
 * @Description 对返回值进行包装
 * @Date 2022/4/6 22:05
 * @Author by lvdong
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
public @interface ResultResponse {
}
