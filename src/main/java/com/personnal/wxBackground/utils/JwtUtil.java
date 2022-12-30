package com.personnal.wxBackground.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.personnal.wxBackground.config.Constants;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;

/**
 * 2 * @Author: Eric
 * 3 * @Date: 2020/3/14 11:37
 * 4
 */
@Slf4j
public class JwtUtil {
    /**
     * 过期时间为15天
     */
    public static final long EXPIRE_TIME = 15 * 24 * 60 * 60 * 1000;

    /**
     * token私钥
     */
    private static final String TOKEN_SECRET = "jYx4jZm6shfqNDyxHhc9CEDHRjB6";


    public static DecodedJWT parse(String token) {
        DecodedJWT decode = JWT.decode(token);
        return decode;
    }

    /**
     * 生成签名
     *
     * @param userId
     * @return
     */
    public static String sign(String userId) {
        //过期时间
        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        //私钥及加密算法
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
        //设置头信息
        HashMap<String, Object> header = new HashMap<>(2);
        header.put("typ", "JWT");
        header.put("alg", "HS256");

        //userID生成签名
        return JWT.create().withHeader(header).withClaim(Constants.ME, userId).withClaim(Constants.LOGIN_TIME, LocalDateTime.now().toString()).sign(algorithm);
    }

    /**
     * 生成签名
     *
     * @param userId
     * @return
     */
    public static String sign(String userId, String platform) {
        //过期时间
        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        //私钥及加密算法
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
        //设置头信息
        HashMap<String, Object> header = new HashMap<>(2);
        header.put("typ", "JWT");
        header.put("alg", "HS256");

        //userID生成签名
        return JWT.create().withHeader(header).withClaim(Constants.ME, userId).withClaim(Constants.LOGIN_TIME, LocalDateTime.now().toString()).withClaim("platform", platform).sign(algorithm);
    }

    public static boolean verify(String token){
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
        JWTVerifier verifier = JWT.require(algorithm).build();
        try {
            DecodedJWT verify = verifier.verify(token);
        } catch (JWTVerificationException e) {
            log.warn("token 无效");
            return false;
        }
        return true;
    }



    public static void main(String[] args) {
        HashMap<String, Object> header = new HashMap<>(2);
        header.put("typ", "JWT");
        header.put("alg", "HS256");
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
        LocalDateTime now = LocalDateTime.now();
        String token = JWT.create().withHeader(header).withClaim("me", "hello").sign(algorithm);
        System.out.println(token);

        while (true){
            Duration between = Duration.between(now, LocalDateTime.now());
            System.out.println(between.getSeconds());
            System.out.println(JwtUtil.verify(token));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (between.getSeconds() > 15) {
                break;
            }

        }
        DecodedJWT decode = JWT.decode(token);
        System.out.println(decode.getClaim(Constants.ME).asString());
    }
}
