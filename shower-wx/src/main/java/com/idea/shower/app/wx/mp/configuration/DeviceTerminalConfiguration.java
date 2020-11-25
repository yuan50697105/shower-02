package com.idea.shower.app.wx.mp.configuration;

import com.idea.shower.app.wx.mp.pojo.properties.DeviceTerminalProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-25 20:56
 */
@Configuration

@EnableConfigurationProperties(DeviceTerminalProperties.class)
public class DeviceTerminalConfiguration {
}