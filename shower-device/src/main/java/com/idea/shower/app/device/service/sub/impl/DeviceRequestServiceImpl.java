package com.idea.shower.app.device.service.sub.impl;

import com.aliyuncs.iot.model.v20180120.PubResponse;
import com.idea.shower.app.device.sender.MqttSender;
import com.idea.shower.app.device.service.sub.DeviceRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-20 21:59
 */
@Service
@Slf4j
public class DeviceRequestServiceImpl implements DeviceRequestService {
    @Autowired
    private MqttSender sender;

    @Override
    public PubResponse request(String productKey, String deviceName, String object) {
        log.info("当前访问:DeviceRequestServiceImpl.request");
        String topic = "/" + productKey + "/" + deviceName + "/user/request";
        log.info("topic:" + topic);
        return sender.send(productKey, topic, object);
    }

    @Override
    public PubResponse openTheDoor(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.openTheDoor");
        return request(productKey, deviceName, "{81}");

    }

    @Override
    public PubResponse closeTheDoor(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.closeTheDoor");
        return request(productKey, deviceName, "{82}");
    }

    @Override
    public PubResponse turnOnTheShowerValve(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.turnOnTheShowerValve");
        return request(productKey, deviceName, "{83}");
    }

    @Override
    public PubResponse turnOffTheShowerValve(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.turnOffTheShowerValve");
        return request(productKey, deviceName, "{83}");
    }

    @Override
    public PubResponse openTheCleaningWaterValve(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.openTheCleaningWaterValve");
        return request(productKey, deviceName, "{85}");
    }

    @Override
    public PubResponse closeTheCleaningWaterValve(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.closeTheCleaningWaterValve");
        return request(productKey, deviceName, "{86}");
    }

    @Override
    public PubResponse turnOnTheHeater(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.turnOnTheHeater");
        return request(productKey,deviceName,"{87}");
    }

    @Override
    public PubResponse turnOffTheHeater(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.turnOffTheHeater");
        return request(productKey,deviceName,"{88}");
    }

    @Override
    public PubResponse turnOnTheVentilationFan(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.turnOnTheVentilationFan");
        return request(productKey,deviceName,"{89}");
    }

    @Override
    public PubResponse turnOffTheVentilationFan(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.turnOffTheVentilationFan");
        return request(productKey,deviceName,"{90}");
    }

    @Override
    public PubResponse powerOnSerialPort1(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.powerOnSerialPort1");
        return request(productKey,deviceName,"{91}");
    }

    @Override
    public PubResponse powerOffSerialPort1(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.powerOffSerialPort1");
        return request(productKey,deviceName,"{92}");
    }

    @Override
    public PubResponse turnOnSerialPort2PowerSupply(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.turnOnSerialPort2PowerSupply");
        return request(productKey,deviceName,"{93}");
    }

    private void log(String productKey, String deviceName, String s) {
        log.info(s);
        log.info("productKey:" + productKey);
        log.info("deviceName:" + deviceName);
    }

    @Override
    public PubResponse turnOffSerialPort2PowerSupply(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.turnOffSerialPort2PowerSupply");

        return request(productKey,deviceName,"{94}");
    }

    @Override
    public PubResponse resetDevice(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.resetDevice");
        return request(productKey,deviceName,"{95}");
    }

    @Override
    public PubResponse queryTheCurrentStatusOfAllModulesOfTheDevice(String productKey, String deviceName) {
        log(productKey, deviceName, "当前访问:DeviceRequestServiceImpl.queryTheCurrentStatusOfAllModulesOfTheDevice");
        return request(productKey,deviceName,"{96}");
    }

}