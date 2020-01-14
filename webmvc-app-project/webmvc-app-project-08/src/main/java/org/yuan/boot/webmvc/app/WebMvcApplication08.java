package org.yuan.boot.webmvc.app;

import org.minbox.framework.api.boot.autoconfigure.swagger.annotation.EnableApiBootSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.DbCoreApplication;
import org.yuan.boot.db.DbMybatisMapperPlusSqlHelperApplication;
import org.yuan.boot.webmvc.WebMvcCoreApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 23:37
 */
@EnableSwagger2
@EnableApiBootSwagger
@SpringBootApplication(scanBasePackageClasses = {WebMvcCoreApplication.class, DbCoreApplication.class, DbMybatisMapperPlusSqlHelperApplication.class})
public class WebMvcApplication08 {
    public static void main(String[] args) {
        SpringApplication.run(WebMvcApplication08.class, args);
    }
}