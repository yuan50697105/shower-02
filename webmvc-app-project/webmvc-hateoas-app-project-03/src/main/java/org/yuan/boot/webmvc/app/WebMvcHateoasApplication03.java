package org.yuan.boot.webmvc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.DbCoreApplication;
import org.yuan.boot.db.DbMybatisMapperApplication;
import org.yuan.boot.webmvc.hateoas.WebMvcHateoasCoreApplication;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:11
 */
@SpringBootApplication(scanBasePackageClasses = {WebMvcHateoasCoreApplication.class, DbCoreApplication.class, DbMybatisMapperApplication.class})
public class WebMvcHateoasApplication03 {
    public static void main(String[] args) {
        SpringApplication.run(WebMvcHateoasApplication03.class, args);
    }
}