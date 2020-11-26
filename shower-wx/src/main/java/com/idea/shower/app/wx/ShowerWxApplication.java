package com.idea.shower.app.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-10 20:53
 */
@SpringBootApplication
public class ShowerWxApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShowerWxApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}