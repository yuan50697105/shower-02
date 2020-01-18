package org.yuan.boot.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.core.ShowerCoreApplication;
import org.yuan.boot.db.ShowerDbApplication;
import org.yuan.boot.mq.ShowerMqApplication;
import org.yuan.boot.redis.ShowerRedisApplication;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-18 17:02
 */
@SpringBootApplication(scanBasePackageClasses = {ShowerCoreApplication.class, ShowerDbApplication.class, ShowerRedisApplication.class, ShowerMqApplication.class})
public class ShowerAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShowerAdminApplication.class, args);
    }
}