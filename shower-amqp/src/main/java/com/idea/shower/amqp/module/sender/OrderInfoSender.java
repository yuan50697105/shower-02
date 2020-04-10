package com.idea.shower.amqp.module.sender;

import com.idea.shower.amqp.commons.sender.BaseSender;
import com.idea.shower.amqp.module.pojo.OrderInfo;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-01 20:56
 */
public interface OrderInfoSender extends BaseSender<OrderInfo> {
    Object getWaterUse(OrderInfo orderInfo);

    Object sendInfoToDevice(OrderInfo orderInfo);
}
