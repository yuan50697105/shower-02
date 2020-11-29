package com.idea.shower.app.device.service.control.impl;

import com.aliyuncs.iot.model.v20180120.PubResponse;
import com.idea.shower.app.device.sender.MqttSender;
import com.idea.shower.app.device.service.sub.DeviceControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-19 22:44
 */
@Service
public class DeviceControlServiceImpl implements DeviceControlService {
    @Autowired
    public MqttSender sender;

    @Override
    public PubResponse control(String productKey, String deviceName, String object) {
        String topic = "/" + productKey + "/" + deviceName + "/user/control";
        return sender.send(productKey, topic, object);
    }

    @Override
    public PubResponse workStart(String productKey, String deviceName, String orderNo) {
        return control(productKey, deviceName, "{71," + orderNo + "}");
    }

    @Override
    public PubResponse workEnd(String productKey, String deviceName, String orderNo) {
        return control(productKey, deviceName, "{72," + orderNo + "}");
    }
}