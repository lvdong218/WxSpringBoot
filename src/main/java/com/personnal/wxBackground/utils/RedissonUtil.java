package com.personnal.wxBackground.utils;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/**
 * @ClassName RedissonUtil
 * @Description redis 分布式锁工具
 * @Date 2022/10/7 21:57
 * @Author by lvdong
 **/
public class RedissonUtil {

    /**
     * 集群模式
     */
    public void clusterMode(){
        Config config = new Config();
        config.useClusterServers()
                .setScanInterval(2000)
                .addNodeAddress("redis://127.0.0.1:7000", "redis://127.0.0.1:7001")
                .addNodeAddress("redis://127.0.0.1:7002");
        RedissonClient redisson = Redisson.create(config);
    }


    /**
     * 单例模式
     */
    public void single(){
        RedissonClient redisson = Redisson.create();
        Config config = new Config();
        config.useSingleServer().setAddress("myRedisServer:6379");
        RedissonClient redissonConfig = Redisson.create(config);
    }

    /**
     * 哨兵模式
     */
    public void sentryMode(){
        Config config = new Config();
        config.useSentinelServers()
                .setMasterName("mymaster")
                .addSentinelAddress("redis://127.0.0.1:26389", "redis://127.0.0.1:26379")
                .addSentinelAddress("redis://127.0.0.1:26319");
        RedissonClient redisson = Redisson.create(config);
    }

    /**
     * 主从模式
     */
    public void masterSlaveMode(){
        Config config = new Config();
        config.useMasterSlaveServers()
                .setMasterAddress("redis://127.0.0.1:6379")
                .addSlaveAddress("redis://127.0.0.1:6389", "redis://127.0.0.1:6332", "redis://127.0.0.1:6419")
                .addSlaveAddress("redis://127.0.0.1:6399");
        RedissonClient redisson = Redisson.create(config);

    }

}
