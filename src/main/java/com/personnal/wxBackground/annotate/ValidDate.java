package com.personnal.wxBackground.annotate;

import com.personnal.wxBackground.validator.ValidDateValidator;
import org.apache.commons.lang3.StringUtils;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @ClassName ValiIdentity
 * @Description 自定义校验
 * @Date 2022/4/14 7:51
 * @Author by lvdong
 **/

@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = { ValidDateValidator.class })
public @interface ValidDate {

    String pattern() default "yyyy-MM-dd";

    String message() default StringUtils.EMPTY;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
