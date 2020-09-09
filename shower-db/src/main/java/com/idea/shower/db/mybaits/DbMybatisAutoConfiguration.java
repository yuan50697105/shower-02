package com.idea.shower.db.mybaits;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-28 00:15
 */
@SpringBootConfiguration
@ComponentScan
@MapperScan(basePackages = "com.idea.shower.db.mybaits.*.mapper")
public class DbMybatisAutoConfiguration {
}