package com.idea.shower.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.idea.shower.core.ShowerCoreApplication;
import com.idea.shower.db.ShowerDbApplication;
import com.idea.shower.mq.ShowerMqApplication;
import com.idea.shower.redis.ShowerRedisApplication;

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