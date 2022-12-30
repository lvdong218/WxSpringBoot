package com.personnal.wxBackground.service.impl;

import com.personnal.wxBackground.service.ICaptchaService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service
public class ICaptchaServiceImpl implements ICaptchaService {

    @Resource
    StringRedisTemplate stringRedisTemplate;

    @Override
    public void saveToRedis(String key, String code) {
        stringRedisTemplate.opsForValue().set(key,code,300, TimeUnit.SECONDS);
    }

    @Override
    public String getToRedis(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }
}
