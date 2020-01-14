package org.yuan.boot.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.DbCoreApplication;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-15 00:27
 */
@SpringBootApplication(scanBasePackageClasses = {DbCoreApplication.class})
public class DbMybatisBaseSqlHelperApplication {
    public static void main(String[] args) {
        SpringApplication.run(DbMybatisBaseSqlHelperApplication.class, args);
    }
}