package com.idea.shower.app.device.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-05-03 20:14
 */
@Data
@ConfigurationProperties(value = "aliyun.iot")
public class AliyunConfigProperties {
    private String regionId;
}