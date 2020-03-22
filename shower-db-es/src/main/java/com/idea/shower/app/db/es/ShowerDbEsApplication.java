package com.idea.shower.app.db.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 20:38
 */
@SpringBootApplication(scanBasePackageClasses = {ShowerDbEsApplication.class})
public class ShowerDbEsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShowerDbEsApplication.class, args);
    }
}