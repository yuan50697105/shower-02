package com.idea.shower.app.wx.mp.rabbitmq.sender;

import com.idea.shower.commons.pojo.DeviceOrderDto;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-28 15:43
 */
public interface DeviceOrderInfoSender {
    void addOrder(DeviceOrderDto deviceOrderDto);

    void endOrder(DeviceOrderDto deviceOrderDto);

}
