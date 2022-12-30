package com.personnal.wxBackground.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "spring.phone")
public class PhoneConfigProperties {
    private String num;
}
