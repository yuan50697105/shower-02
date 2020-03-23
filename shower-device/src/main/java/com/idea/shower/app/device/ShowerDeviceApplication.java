package com.idea.shower.app.device;

import com.idea.shower.app.db.ShowerDbApplication;
import com.idea.shower.web.webmvc.WebMvcCoreApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {ShowerDeviceApplication.class, ShowerDbApplication.class, WebMvcCoreApplication.class})
public class ShowerDeviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShowerDeviceApplication.class, args);
    }
}
