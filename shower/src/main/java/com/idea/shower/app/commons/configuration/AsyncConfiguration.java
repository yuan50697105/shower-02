package com.idea.shower.app.commons.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-19 21:28
 */
@Configuration
public class AsyncConfiguration {
    @SuppressWarnings("AlibabaThreadPoolCreation")
    @Bean
    public Executor executor() {
        return Executors.newFixedThreadPool(8);
    }
}