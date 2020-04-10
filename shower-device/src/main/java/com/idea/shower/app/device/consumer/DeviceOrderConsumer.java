package com.idea.shower.app.device.consumer;

import com.idea.shower.amqp.configuration.QueueConstants;
import com.idea.shower.amqp.module.pojo.AmqpDeviceInfo;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-09 20:51
 */
@Component
@RabbitListener(queues = QueueConstants.TOPIC_OPEN_ROOM)
public class DeviceOrderConsumer {

    @RabbitHandler
    public Object openRoom(AmqpDeviceInfo deviceInfo) {
        // TODO: 2020/4/9 发送订单信息到设备
        return null;

    }
}