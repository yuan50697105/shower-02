package com.idea.shower.app.wx.mp.rabbitmq.sender.impl;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.lang.UUID;
import com.idea.shower.app.wx.mp.rabbitmq.sender.DeviceOrderInfoSender;
import com.idea.shower.commons.constants.Queues;
import com.idea.shower.commons.pojo.DeviceOrderDto;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-28 15:43
 */
@Service
public class DeviceOrderInfoSenderImpl implements DeviceOrderInfoSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private Snowflake snowflake;

    @Override
    public void addOrder(DeviceOrderDto deviceOrderDto) {
        rabbitTemplate.convertAndSend(Queues.QUEUE_DEVICE_ORDER_ADD, deviceOrderDto, new CorrelationData(UUID.fastUUID().toString()));
    }

    @Override
    public void endOrder(DeviceOrderDto deviceOrderDto) {
        rabbitTemplate.convertAndSend(Queues.QUEUE_DEVICE_ORDER_END, deviceOrderDto, new CorrelationData(UUID.fastUUID().toString()));
    }

}