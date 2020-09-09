package com.idea.shower.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 16:56
 */
@SpringBootConfiguration
@ComponentScan
@EnableRedisRepositories
public class RedisAutoConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(RedisAutoConfiguration.class, args);
    }

}