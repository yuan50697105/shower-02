package com.idea.shower.app.device.service;

import com.aliyuncs.iot.model.v20180120.PubResponse;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-19 22:44
 */
public interface DeviceControlService {
    PubResponse control(String productKey, String deviceName, String object);

    PubResponse workStart(String productKey, String deviceName, String orderNo);

    PubResponse workEnd(String productKey, String deviceName, String orderNo);
}
