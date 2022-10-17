package com.personnal.wxBackground.validator;

import com.personnal.wxBackground.annotate.ValidDate;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName ValiIdentityValidator
 * @Description TODO
 * @Date 2022/4/14 7:53
 * @Author by lvdong
 **/
@Slf4j
public class ValidDateValidator implements ConstraintValidator<ValidDate, String> {


    private String pattern = StringUtils.EMPTY;

    private static DateTimeFormatter defaultDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    @Override
    public void initialize(ValidDate constraintAnnotation) {
        pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        try{
            LocalDate localDate = LocalDate.parse(s,defaultDateTimeFormatter);
            return true;
        }catch (Exception e){
            log.error("日期转换错误:",e);
            return false;
        }
    }
}
