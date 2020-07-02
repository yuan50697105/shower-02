package com.idea.shower.admin;

import com.idea.shower.app.db.ShowerDbApplication;
import com.idea.shower.commons.ShowerCommons;
import com.idea.shower.db.core.DbCoreApplication;
import com.idea.shower.web.webmvc.WebMvcCoreApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackageClasses = {ShowerAdminApplication.class, ShowerDbApplication.class, WebMvcCoreApplication.class, DbCoreApplication.class, ShowerCommons.class})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ShowerAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShowerAdminApplication.class, args);
    }
}
