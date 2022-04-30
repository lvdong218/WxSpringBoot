package com.personnal.wxBackground;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.personnal.wxBackground.mapper")
public class WxBackgroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxBackgroundApplication.class, args);
	}

}
