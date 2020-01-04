package org.yuan.boot.webmvc.app;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.minbox.framework.api.boot.autoconfigure.swagger.annotation.EnableApiBootSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.yuan.boot.DbCoreApplication;
import org.yuan.boot.DbMybatisBaseApplication;
import org.yuan.boot.webmvc.WebMvcCoreApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:11
 */
@EnableSwagger2
@EnableApiBootSwagger
@SpringBootApplication(scanBasePackageClasses = {WebMvcCoreApplication.class, DbCoreApplication.class, DbMybatisBaseApplication.class})
public class WebMvcApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(WebMvcCoreApplication.class, args);
    }

//    @Bean
//    public Snowflake snowflake() {
//        return IdUtil.createSnowflake(1, 2);
//    }

}