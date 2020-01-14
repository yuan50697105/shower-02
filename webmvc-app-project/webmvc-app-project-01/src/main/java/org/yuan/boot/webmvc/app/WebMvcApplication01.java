package org.yuan.boot.webmvc.app;

import lombok.extern.log4j.Log4j2;
import org.minbox.framework.api.boot.autoconfigure.swagger.annotation.EnableApiBootSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.DbMybatisBaseApplication;
import org.yuan.boot.webmvc.WebMvcCoreApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:11
 */
@EnableSwagger2
@EnableApiBootSwagger
@SpringBootApplication(scanBasePackageClasses = {WebMvcCoreApplication.class, DbMybatisBaseApplication.class})
@Log4j2
public class WebMvcApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(WebMvcApplication01.class, args);
    }
}