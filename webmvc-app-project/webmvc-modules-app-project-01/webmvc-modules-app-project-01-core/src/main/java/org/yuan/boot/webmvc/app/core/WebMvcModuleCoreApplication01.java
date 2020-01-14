package org.yuan.boot.webmvc.app.core;

import org.minbox.framework.api.boot.autoconfigure.swagger.annotation.EnableApiBootSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-12 17:02
 */
@EnableSwagger2
@EnableApiBootSwagger
@SpringBootApplication
public class WebMvcModuleCoreApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(WebMvcModuleCoreApplication01.class, args);
    }
}