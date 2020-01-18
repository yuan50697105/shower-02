package org.yuan.boot.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.DbMybatisBaseApplication;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-18 17:02
 */
@SpringBootApplication(scanBasePackageClasses = {DbMybatisBaseApplication.class})
public class ShowerDbApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShowerDbApplication.class, args);
    }
}