package com.idea.shower.db.mybaits;

import com.idea.shower.db.core.DbCoreApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {DbMybatisApplication.class, DbCoreApplication.class})
public class DbMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(DbMybatisApplication.class, args);
    }
}
