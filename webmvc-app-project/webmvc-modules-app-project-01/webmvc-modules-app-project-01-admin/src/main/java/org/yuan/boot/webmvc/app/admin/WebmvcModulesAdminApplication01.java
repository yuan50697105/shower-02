package org.yuan.boot.webmvc.app.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.webmvc.app.db.WebMvcModulesDbApplication01;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-01 19:57
 */
@SpringBootApplication
public class WebmvcModulesAdminApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(WebMvcModulesDbApplication01.class, args);
    }
}