package com.idea.shower.app.wx;

import com.idea.shower.app.db.ShowerDbApplication;
import com.idea.shower.app.wx.mp.service.WxDeviceService;
import com.idea.shower.commons.ShowerCommons;
import com.idea.shower.redis.RedisApplicaiton;
import com.idea.shower.web.webmvc.WebMvcCoreApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-10 20:53
 */
@SpringBootApplication(scanBasePackageClasses = {ShowerWxApplication.class, ShowerDbApplication.class, WebMvcCoreApplication.class, RedisApplicaiton.class, ShowerCommons.class})
public class ShowerWxApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShowerWxApplication.class, args);
    }
}