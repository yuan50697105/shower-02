package com.idea.shower.app.wx.mp.service.impl;

import com.idea.shower.app.wx.mp.pojo.properties.DeviceTerminalProperties;
import com.idea.shower.app.wx.mp.service.WxDeviceMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-26 21:16
 */
@Service
@Transactional
public class WxDeviceMessageServiceImpl implements WxDeviceMessageService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DeviceTerminalProperties properties;
}