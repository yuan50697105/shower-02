package com.idea.shower.commons;

import com.alibaba.fastjson.JSON;
import org.minbox.framework.api.boot.oss.ApiBootOssService;
import org.minbox.framework.api.boot.storage.response.ApiBootObjectStorageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.FileInputStream;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-09-17 21:57
 */
@SpringBootApplication
public class Application {
    @Autowired
    private ApiBootOssService apiBootOssService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                String path = "D:\\IdeaProjects\\shower-02-02\\shower-admin\\lib\\shower-common-2.3.0.jar";
                ApiBootObjectStorageResponse response = apiBootOssService.upload("shower-commons.jar", new FileInputStream(path));
                System.out.println("JSON.toJSONString(response) = " + JSON.toJSONString(response));
            }
        };
    }

}