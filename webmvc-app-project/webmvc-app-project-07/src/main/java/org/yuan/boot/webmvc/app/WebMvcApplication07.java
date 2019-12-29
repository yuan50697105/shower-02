package org.yuan.boot.webmvc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.DbCoreApplication;
import org.yuan.boot.db.DbMybatisPlusSqlHelperApplication;
import org.yuan.boot.webmvc.WebMvcCoreApplication;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 23:37
 */
@SpringBootApplication(scanBasePackageClasses = {WebMvcCoreApplication.class, DbCoreApplication.class, DbMybatisPlusSqlHelperApplication.class})
public class WebMvcApplication07 {
    public static void main(String[] args) {
        SpringApplication.run(WebMvcApplication07.class, args);
    }
}