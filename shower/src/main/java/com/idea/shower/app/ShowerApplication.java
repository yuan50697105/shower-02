package com.idea.shower.app;

import com.idea.shower.app.admin.ShowerAdminApplication;
import com.idea.shower.app.device.ShowerDeviceApplication;
import com.idea.shower.app.wx.ShowerWxApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {ShowerAdminApplication.class, ShowerWxApplication.class, ShowerDeviceApplication.class})
public class ShowerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShowerApplication.class, args);
    }
}