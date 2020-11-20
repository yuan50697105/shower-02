package com.idea.shower.app.device.service.impl;

import com.aliyuncs.iot.model.v20180120.PubResponse;
import com.idea.shower.app.device.sender.MqttSender;
import com.idea.shower.app.device.service.DeviceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-20 21:59
 */
@Service
public class DeviceRequestServiceImpl implements DeviceRequestService {
    @Autowired
    private MqttSender sender;

    @Override
    public PubResponse request(String productKey, String deviceName, String object) {
        String topic = "/" + productKey + "/" + deviceName + "/user/request";
        return sender.send(productKey, topic, object);
    }

    @Override
    public PubResponse openTheDoor(String productKey, String deviceName) {
        return request(productKey, deviceName, "{81}");

    }

    @Override
    public PubResponse closeTheDoor(String productKey, String deviceName) {
        return request(productKey, deviceName, "{82}");
    }

    @Override
    public PubResponse turnOnTheShowerValve(String productKey, String deviceName) {
        return request(productKey, deviceName, "{82}");
    }

}