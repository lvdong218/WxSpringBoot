package com.personnal.wxBackground.utils;

import com.personnal.wxBackground.wxEnum.ResultCode;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Result
 * @Description 返回类
 * @Date 2022/4/6 21:28
 * @Author by lvdong
 **/
@Data
@Builder
public class ResultResponseUtils<V> implements Serializable {
    Integer code;
    String msg;
    V data;
    public ResultResponseUtils(Integer code, String msg, V data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public ResultResponseUtils(ResultCode resultCode, V data){
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }

    /**
     * 成功
     * @return
     */
    public static ResultResponseUtils success(){
        return new ResultResponseUtils(ResultCode.SUCCESS,null);
    }

    public static ResultResponseUtils fail(){
        return new ResultResponseUtils(ResultCode.FAIL,null);
    }
}
