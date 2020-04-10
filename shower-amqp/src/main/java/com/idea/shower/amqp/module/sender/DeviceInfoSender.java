package com.idea.shower.amqp.module.sender;

import com.idea.shower.amqp.commons.sender.BaseSender;
import com.idea.shower.amqp.module.pojo.AmqpDeviceInfo;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-09 20:34
 */
public interface DeviceInfoSender extends BaseSender<AmqpDeviceInfo> {
    Object sendAndRec(AmqpDeviceInfo amqpDeviceInfo);

    Double sendAndGetWaterUse(AmqpDeviceInfo amqpDeviceInfo);
}
