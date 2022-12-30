package com.personnal.wxBackground;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.personnal.wxBackground.mapper")
@Slf4j
public class WxBackgroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxBackgroundApplication.class, args);

	}

}
