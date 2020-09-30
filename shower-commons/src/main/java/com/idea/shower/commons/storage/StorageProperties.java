package com.idea.shower.commons.storage;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-09-22 10:12
 */
@ConfigurationProperties(prefix = StorageProperties.STORAGE)
@Data
public class StorageProperties {
    public static final String STORAGE = "storage";
    private String domainUrl;
    private String downloadPath;
}