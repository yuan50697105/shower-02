package com.idea.shower.app.device.service.receive;

import com.idea.shower.commons.exception.ResultException;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-23 21:24
 */
public interface DeviceReceiveService {

    /**
     * 结束数据
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @param operating  操作
     * @param messageId  消息Id
     * @param content    消息内容
     * @throws ResultException 接收异常
     */
    void receiveData(String productKey, String deviceName, String operating, String messageId, String content) throws ResultException;

    /**
     * 作用：
     * 1，当设备处于工作状态，每隔15秒会向服务器发送设备各个模块状态和使用时间情况
     * 2，当设备的各个模块工作状态发生了改变(按钮引发，或门打开关闭引发)，会立即向服务器发送所有模块的工作状态
     * 3，对订阅主题发来的2-1，进行回复
     * 总结：工作状态下自动15秒发送一次。或者设备模块发生了工作状态变化，立即发送。
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @param messageId  消息Id
     * @param content    消息内容
     */
    void work15Sec(String productKey, String deviceName, String messageId, String content);

    /**
     * 作用：
     * 1，在待机状态下，每隔5分钟，向服务器发送一次设备状态
     * 总结：在待机状态下，每隔5分钟，向服务器发送一次设备状态
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @param messageId  消息Id
     * @param content    消息内容
     */
    void timing5Min(String productKey, String deviceName, String messageId, String content);

    /**
     * 作用：
     * 1，对订阅主题发来的2-2，进行回复
     * 总结：对订阅主题发来的2-2，进行回复
     *
     * @param productKey 产品编号
     * @param deviceName 设备名称
     * @param messageId  消息Id
     * @param content    消息内容
     */
    void response(String productKey, String deviceName, String messageId, String content);
}
