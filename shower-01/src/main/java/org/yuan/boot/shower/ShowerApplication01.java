package org.yuan.boot.shower;

import lombok.extern.log4j.Log4j2;
import org.minbox.framework.api.boot.autoconfigure.swagger.annotation.EnableApiBootSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
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
@EnableWebSecurity
@SpringBootApplication(scanBasePackageClasses = {WebMvcCoreApplication.class, DbMybatisBaseApplication.class})
@Log4j2
public class ShowerApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(ShowerApplication01.class, args);
    }
}