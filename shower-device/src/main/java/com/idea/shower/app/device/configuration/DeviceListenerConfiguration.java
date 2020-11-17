package com.idea.shower.app.device.configuration;

import com.idea.shower.app.device.properties.DeviceListenerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-17 22:23
 */
@Configuration
@EnableConfigurationProperties(DeviceListenerProperties.class)
public class DeviceListenerConfiguration {
}