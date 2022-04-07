package com.personnal.wxBackground.wxEnum;

/**
 * @ClassName ResultCode
 * @Description controller 返回code
 * @Date 2022/4/6 21:21
 * @Author by lvdong
 **/
public enum ResultCode{
    SUCCESS(200,"成功"),
    FAIL(-1,"请求失败");

    /**
     * 返回code码值
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String msg;
    ResultCode(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
