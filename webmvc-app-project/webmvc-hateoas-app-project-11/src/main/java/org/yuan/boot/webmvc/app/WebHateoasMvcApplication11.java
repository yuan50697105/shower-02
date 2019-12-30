package org.yuan.boot.webmvc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.DbCoreApplication;
import org.yuan.boot.DbJpaMybatisMapperApplication;
import org.yuan.boot.webmvc.hateoas.WebMvcHateoasCoreApplication;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 23:37
 */
@SpringBootApplication(scanBasePackageClasses = {WebMvcHateoasCoreApplication.class, DbCoreApplication.class, DbJpaMybatisMapperApplication.class})
public class WebHateoasMvcApplication11 {
    public static void main(String[] args) {
        SpringApplication.run(WebHateoasMvcApplication11.class, args);
    }
}