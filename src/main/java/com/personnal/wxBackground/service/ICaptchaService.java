package com.personnal.wxBackground.service;

public interface ICaptchaService {

    void saveToRedis(String key,String code);

    String getToRedis(String key);
}
