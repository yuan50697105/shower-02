package org.yuan.boot.webmvc.app.wx;

import org.minbox.framework.api.boot.autoconfigure.swagger.annotation.EnableApiBootSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.DbCoreApplication;
import org.yuan.boot.DbMybatisBaseApplication;
import org.yuan.boot.webmvc.WebMvcCoreApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-12 17:03
 */
@EnableSwagger2
@EnableApiBootSwagger
@SpringBootApplication(scanBasePackageClasses = {WebMvcCoreApplication.class, DbCoreApplication.class, DbMybatisBaseApplication.class})
public class WebMvcModuleDeviceApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(WebMvcModuleDeviceApplication01.class, args);
    }
}