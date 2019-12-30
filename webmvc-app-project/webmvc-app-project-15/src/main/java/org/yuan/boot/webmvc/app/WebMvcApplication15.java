package org.yuan.boot.webmvc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.DbCoreApplication;
import org.yuan.boot.DbJpaMybatisMapperPlusApplication;
import org.yuan.boot.webmvc.WebMvcCoreApplication;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 23:37
 */
@SpringBootApplication(scanBasePackageClasses = {WebMvcCoreApplication.class, DbCoreApplication.class, DbJpaMybatisMapperPlusApplication.class})
public class WebMvcApplication15 {
    public static void main(String[] args) {
        SpringApplication.run(WebMvcApplication15.class, args);
    }
}