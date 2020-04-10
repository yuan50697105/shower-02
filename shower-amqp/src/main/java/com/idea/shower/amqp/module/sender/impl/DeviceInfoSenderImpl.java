package com.idea.shower.amqp.module.sender.impl;

import com.idea.shower.amqp.commons.sender.impl.BaseSenderImpl;
import com.idea.shower.amqp.configuration.QueueConstants;
import com.idea.shower.amqp.module.pojo.AmqpDeviceInfo;
import com.idea.shower.amqp.module.sender.DeviceInfoSender;
import org.springframework.stereotype.Component;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-09 20:36
 */
@Component
public class DeviceInfoSenderImpl extends BaseSenderImpl<AmqpDeviceInfo> implements DeviceInfoSender {

    @Override
    public Object sendAndRec(AmqpDeviceInfo amqpDeviceInfo) {
        return sendAndRec(QueueConstants.EXCHANGE, QueueConstants.TOPIC_OPEN_ROOM, amqpDeviceInfo);
    }

    @Override
    public Double sendAndGetWaterUse(AmqpDeviceInfo amqpDeviceInfo) {

        return (Double) sendAndRec(QueueConstants.EXCHANGE, QueueConstants.TOPIC_GET_WATER_USE, amqpDeviceInfo);
    }
}