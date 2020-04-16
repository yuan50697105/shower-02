package com.idea.shower.amqp.module.sender.impl;

import com.idea.shower.amqp.commons.sender.impl.BaseSenderImpl;
import com.idea.shower.amqp.configuration.QueueConstants;
import com.idea.shower.amqp.module.pojo.OrderInfo;
import com.idea.shower.amqp.module.sender.OrderInfoSender;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-01 20:57
 */
@Component
@Transactional
public class OrderInfoSenderImpl extends BaseSenderImpl<OrderInfo> implements OrderInfoSender {

    @Override
    public Object getWaterUse(OrderInfo orderInfo) {
        return sendAndRec(QueueConstants.QUEUE_WATER_USE, orderInfo);
    }

    @Override
    public Object sendInfoToDevice(OrderInfo orderInfo) {
        Long orderId = orderInfo.getOrderId();
        return null;
    }

}