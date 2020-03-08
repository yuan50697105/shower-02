package com.idea.shower.shower;

import lombok.extern.log4j.Log4j2;
import org.minbox.framework.api.boot.autoconfigure.swagger.annotation.EnableApiBootSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import com.idea.shower.db.mybaits.DbMybatisBaseApplication;
import com.idea.shower.web.webmvc.WebMvcCoreApplication;
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
@EnableAsync
@EnableScheduling
@EnableCaching
@SpringBootApplication(scanBasePackageClasses = {WebMvcCoreApplication.class, DbMybatisBaseApplication.class})
@Log4j2
public class ShowerApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(ShowerApplication01.class, args);
    }
}