package com.personnal.wxBackground.wxEnum;

/**
 * @ClassName RedisPrefix
 * @Description controller 返回code
 * @Date 2022/4/6 21:21
 * @Author by lvdong
 **/
public enum RedisPrefix {
    TOKEN("token::","登录token"),
    ;

    /**
     * 返回code码值
     */
    private String code;
    /**
     * 返回信息
     */
    private String msg;
    RedisPrefix(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
