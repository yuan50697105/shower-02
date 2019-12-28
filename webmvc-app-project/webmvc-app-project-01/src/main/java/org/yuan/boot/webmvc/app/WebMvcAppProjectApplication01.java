package org.yuan.boot.webmvc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.DbCoreApplication;
import org.yuan.boot.webmvc.db.WebMvcDbMybatisBaseApplication;

@SpringBootApplication(scanBasePackageClasses = {DbCoreApplication.class, WebMvcDbMybatisBaseApplication.class})
public class WebMvcAppProjectApplication01 {
    public static void main(String[] args) {

        SpringApplication.run(WebMvcAppProjectApplication01.class, args);
    }
}
