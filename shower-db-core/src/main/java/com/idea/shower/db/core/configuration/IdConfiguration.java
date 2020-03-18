package com.idea.shower.db.core.configuration;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-27 21:13
 */
@Configuration
public class IdConfiguration {
    @Bean
    public Snowflake snowflake() {
        return IdUtil.createSnowflake(1, 1);
    }

}