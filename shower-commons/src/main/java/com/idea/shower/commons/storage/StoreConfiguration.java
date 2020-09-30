package com.idea.shower.commons.storage;

import org.minbox.framework.api.boot.autoconfigure.oss.ApiBootOssProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-09-22 10:11
 */
@Configuration
@EnableConfigurationProperties(StorageProperties.class)
public class StoreConfiguration {
    @Bean
    @ConditionalOnMissingBean
    CommonsOssService apiBootOssOverrideService(ApiBootOssProperties apiBootOssProperties) {
        return new CommonsOssService(apiBootOssProperties.getRegion().getEndpoint(), apiBootOssProperties.getBucketName(), apiBootOssProperties.getAccessKeyId(), apiBootOssProperties.getAccessKeySecret(), apiBootOssProperties.getDomain());
    }
}