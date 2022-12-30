package com.personnal.wxBackground.config;

import org.redisson.Redisson;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {
    @Autowired
    private com.personnal.wxBackground.config.RedisConfigProperties redisConfigProperties;

    //添加redisson的bean
    @Bean
    public Redisson redisson() {
        //redisson版本是3.5，集群的ip前面要加上“redis://”，不然会报错，3.2版本可不加
        String redissonAddr = "redis://" + redisConfigProperties.getHost()+":"+redisConfigProperties.getPort();
        Config config = new Config();
        SingleServerConfig singleConfig = config.useSingleServer().setAddress(redissonAddr).
                //心跳检测，定时与redis连接，可以防止一段时间过后，与redis的连接断开
                        setPingConnectionInterval(1000);
        singleConfig.setPassword(redisConfigProperties.getPassword());//设置密码
        singleConfig.setDatabase(Integer.valueOf(redisConfigProperties.getDatabase()));
        return (Redisson) Redisson.create(config);
    }
}
