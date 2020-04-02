package com.idea.shower.app.db;

import com.idea.shower.db.mybaits.DbMybatisApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-10 20:45
 */
@SpringBootApplication(scanBasePackageClasses = {DbMybatisApplication.class, ShowerDbApplication.class})
public class ShowerDbApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShowerDbApplication.class, args);
    }
}