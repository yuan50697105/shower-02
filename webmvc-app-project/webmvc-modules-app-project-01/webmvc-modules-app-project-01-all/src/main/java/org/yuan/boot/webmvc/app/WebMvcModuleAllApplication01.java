package org.yuan.boot.webmvc.app;

import org.minbox.framework.api.boot.autoconfigure.swagger.annotation.EnableApiBootSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.webmvc.app.admin.WebMvcModulesAdminApplication01;
import org.yuan.boot.webmvc.app.core.WebMvcModuleCoreApplication01;
import org.yuan.boot.webmvc.app.device.WebMvcModuleDeviceApplication01;
import org.yuan.boot.webmvc.app.wx.WebMvcModuleWxApplication01;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-12 17:01
 */
@EnableSwagger2
@EnableApiBootSwagger
@SpringBootApplication(scanBasePackageClasses = {WebMvcModuleCoreApplication01.class, WebMvcModulesAdminApplication01.class, WebMvcModuleWxApplication01.class, WebMvcModuleDeviceApplication01.class})
public class WebMvcModuleAllApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(WebMvcModuleAllApplication01.class, args);
    }
}