package com.idea.shower.admin;

import cn.hutool.extra.spring.SpringUtil;
import com.idea.shower.commons.ShowerCommons;
import com.idea.shower.web.webmvc.WebMvcCoreApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackageClasses = {ShowerAdminApplication.class, ShowerDbApplication.class, WebMvcCoreApplication.class, DbCoreApplication.class, ShowerCommons.class})
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Import(SpringUtil.class)
public class ShowerAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShowerAdminApplication.class, args);
    }
}
