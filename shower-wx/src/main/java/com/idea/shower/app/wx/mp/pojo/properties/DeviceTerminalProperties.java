package com.idea.shower.app.wx.mp.pojo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-25 20:55
 */
@ConfigurationProperties(prefix = DeviceTerminalProperties.DEVICE_TERMINAL)
public class DeviceTerminalProperties {
    public static final String DEVICE_TERMINAL = "device.terminal";
    private String deviceTerminalUrl;
}