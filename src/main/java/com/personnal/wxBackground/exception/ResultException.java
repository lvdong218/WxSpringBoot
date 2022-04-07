package com.personnal.wxBackground.exception;

/**
 * @ClassName ResultException
 * @Description 异常类
 * @Date 2022/4/6 21:58
 * @Author by lvdong
 **/
public class ResultException extends RuntimeException{
    Integer code;
    String msg;
    public ResultException(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
