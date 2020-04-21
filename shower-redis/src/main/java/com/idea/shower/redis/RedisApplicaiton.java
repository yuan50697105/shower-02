package com.idea.shower.redis;

import com.idea.shower.redis.module.order.dao.OrderRedisDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import java.util.concurrent.TimeUnit;

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

    @Bean("commandLineRunner")
    public CommandLineRunner commandLineRunner(StringRedisTemplate stringRedisTemplate) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                stringRedisTemplate.opsForValue().set(OrderRedisDao.ORDER_INFO_REDIS_KEY + "1111", "aaa", 10, TimeUnit.SECONDS);
            }
        };
    }

    @Bean("redisMessageListenerContainer")
    public RedisMessageListenerContainer redisMessageListenerContainer(RedisConnectionFactory redisConnectionFactory) {
        RedisMessageListenerContainer redisMessageListenerContainer = new RedisMessageListenerContainer();
        redisMessageListenerContainer.setConnectionFactory(redisConnectionFactory);
        return redisMessageListenerContainer;
    }
}