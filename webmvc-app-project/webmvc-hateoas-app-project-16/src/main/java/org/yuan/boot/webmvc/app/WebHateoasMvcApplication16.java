package org.yuan.boot.webmvc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.DbCoreApplication;
import org.yuan.boot.DbJpaMybatisMapperPlusSqlHelperApplication;
import org.yuan.boot.webmvc.hateoas.WebMvcHateoasCoreApplication;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 23:37
 */
@SpringBootApplication(scanBasePackageClasses = {WebMvcHateoasCoreApplication.class, DbCoreApplication.class, DbJpaMybatisMapperPlusSqlHelperApplication.class})
public class WebHateoasMvcApplication16 {
    public static void main(String[] args) {
        SpringApplication.run(WebHateoasMvcApplication16.class, args);
    }
}