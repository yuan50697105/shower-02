package org.yuan.boot.webmvc.app;

import org.minbox.framework.api.boot.autoconfigure.swagger.annotation.EnableApiBootSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.DbCoreApplication;
import org.yuan.boot.DbJpaMybatisPlusSqlHelperApplication;
import org.yuan.boot.webmvc.hateoas.WebMvcHateoasCoreApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 23:37
 */
@EnableSwagger2
@EnableApiBootSwagger
@SpringBootApplication(scanBasePackageClasses = {WebMvcHateoasCoreApplication.class, DbCoreApplication.class, DbJpaMybatisPlusSqlHelperApplication.class})
public class WebHateoasMvcApplication14 {
    public static void main(String[] args) {
        SpringApplication.run(WebHateoasMvcApplication14.class, args);
    }
}