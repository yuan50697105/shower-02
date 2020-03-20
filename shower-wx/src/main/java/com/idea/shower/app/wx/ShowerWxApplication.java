package com.idea.shower.app.wx;

import com.idea.shower.web.webmvc.WebMvcCoreApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-10 20:53
 */
@SpringBootApplication(scanBasePackageClasses = {ShowerWxApplication.class, WebMvcCoreApplication.class})
public class ShowerWxApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShowerWxApplication.class, args);
    }
}