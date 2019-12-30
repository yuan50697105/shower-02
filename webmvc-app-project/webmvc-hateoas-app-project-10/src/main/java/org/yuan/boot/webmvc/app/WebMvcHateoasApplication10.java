package org.yuan.boot.webmvc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.DbCoreApplication;
import org.yuan.boot.db.DbJpaMybatisSqlHelperApplication;
import org.yuan.boot.webmvc.hateoas.WebMvcHateoasCoreApplication;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 23:37
 */
@SpringBootApplication(scanBasePackageClasses = {WebMvcHateoasCoreApplication.class, DbCoreApplication.class, DbJpaMybatisSqlHelperApplication.class})
public class WebMvcHateoasApplication10 {
    public static void main(String[] args) {
        SpringApplication.run(WebMvcHateoasApplication10.class, args);
    }
}