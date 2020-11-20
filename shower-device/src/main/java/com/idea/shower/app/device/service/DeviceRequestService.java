package com.idea.shower.app.device.service;

import com.aliyuncs.iot.model.v20180120.PubResponse;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-20 21:59
 */
public interface DeviceRequestService {
    PubResponse request(String productKey, String deviceName, String object);

    PubResponse openTheDoor(String productKey, String deviceName);

    PubResponse closeTheDoor(String productKey, String deviceName);

    PubResponse turnOnTheShowerValve(String productKey, String code);
}
