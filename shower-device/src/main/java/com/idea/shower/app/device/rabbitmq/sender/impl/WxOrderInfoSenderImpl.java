package com.idea.shower.app.device.rabbitmq.sender.impl;

import cn.hutool.core.lang.Snowflake;
import com.idea.shower.app.device.rabbitmq.sender.WxOrderInfoSender;
import com.idea.shower.commons.constants.Queues;
import com.idea.shower.commons.pojo.WxUseOrderRequest;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-28 18:50
 */
@Service
public class WxOrderInfoSenderImpl implements WxOrderInfoSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private Snowflake snowflake;
    @Override
    public void endOrder(WxUseOrderRequest request) {
        rabbitTemplate.convertAndSend(Queues.QUEUE_WX_ORDER_END,request,new CorrelationData(snowflake.nextIdStr()));
    }
}