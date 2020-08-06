package org.idea.shower.admin;

import com.idea.shower.app.db.ShowerDbApplication;
import com.idea.shower.web.webmvc.WebMvcCoreApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackageClasses = {VueApiApplication.class, ShowerDbApplication.class, WebMvcCoreApplication.class})
public class VueApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueApiApplication.class, args);
    }

}