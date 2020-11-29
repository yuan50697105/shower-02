package com.idea.shower.commons.configuration;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-28 15:45
 */
@Configuration
public class SnowflakeAlgorithmConfiguration {

    public static final String SNOWFLAKE = "snowflake";

    @Bean(SNOWFLAKE)
    public Snowflake snowflake() {
        return IdUtil.createSnowflake(1, 1);
    }
}