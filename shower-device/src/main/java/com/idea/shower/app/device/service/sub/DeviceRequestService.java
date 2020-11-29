package com.idea.shower.app.device.service.sub;

import com.aliyuncs.iot.model.v20180120.PubResponse;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-20 21:59
 */
public interface DeviceRequestService {
    /**
     * 设备控制
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @param object     内容
     * @return 响应值
     */
    PubResponse request(String productKey, String deviceName, String object);

    /**
     * 开门
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse openTheDoor(String productKey, String deviceName);

    /**
     * 关闭们
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse closeTheDoor(String productKey, String deviceName);

    /**
     * 开启淋浴阀
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse turnOnTheShowerValve(String productKey, String deviceName);

    /**
     * 关闭淋浴阀
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse turnOffTheShowerValve(String productKey, String deviceName);

    /**
     * 开启清洗阀
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse openTheCleaningWaterValve(String productKey, String deviceName);

    /**
     * 关清洗水阀
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse closeTheCleaningWaterValve(String productKey, String deviceName);

    /**
     * 开暖风机
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse turnOnTheHeater(String productKey, String deviceName);

    /**
     * 关暖风机
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse turnOffTheHeater(String productKey, String deviceName);

    /**
     * 关换气扇
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse turnOnTheVentilationFan(String productKey, String deviceName);

    /**
     * 关换气扇
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse turnOffTheVentilationFan(String productKey, String deviceName);

    /**
     * 开启串口1供电
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse powerOnSerialPort1(String productKey, String deviceName);

    /**
     * 关闭串口1供电
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse powerOffSerialPort1(String productKey, String deviceName);

    /**
     * 开启串口2供电
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse turnOnSerialPort2PowerSupply(String productKey, String deviceName);

    /**
     * 关闭串口2供电
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse turnOffSerialPort2PowerSupply(String productKey, String deviceName);

    /**
     * 复位设备
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse resetDevice(String productKey, String deviceName);

    /**
     * 查询设备当前所有模块状态
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @return 响应值
     */
    PubResponse queryTheCurrentStatusOfAllModulesOfTheDevice(String productKey, String deviceName);



}
