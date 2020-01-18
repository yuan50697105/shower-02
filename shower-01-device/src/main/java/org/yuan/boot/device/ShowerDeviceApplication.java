package org.yuan.boot.device;

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
 * @create: 2020-01-18 17:03
 */
@SpringBootApplication(scanBasePackageClasses = {ShowerCoreApplication.class, ShowerDbApplication.class, ShowerRedisApplication.class, ShowerMqApplication.class})
public class ShowerDeviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShowerDeviceApplication.class, args);
    }
}