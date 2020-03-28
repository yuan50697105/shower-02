package com.idea.shower.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 16:56
 */
@SpringBootApplication
@EnableRedisRepositories
public class RedisApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(RedisApplicaiton.class, args);
    }
}