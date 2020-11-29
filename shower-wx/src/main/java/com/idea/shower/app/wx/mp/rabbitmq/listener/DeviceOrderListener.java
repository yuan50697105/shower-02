package com.idea.shower.app.wx.mp.rabbitmq.listener;

import com.idea.shower.app.wx.mp.service.WxOrderInfoService;
import com.idea.shower.commons.constants.Queues;
import com.idea.shower.commons.pojo.WxEndOrderRequest;
import com.rabbitmq.client.Channel;
import lombok.SneakyThrows;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;

import java.util.Map;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-28 18:54
 */
@RabbitListener(queues = Queues.QUEUE_WX_ORDER_END)
public class DeviceOrderListener {
    @Autowired
    private WxOrderInfoService wxOrderInfoService;

    @SneakyThrows
    public void endOrder(@Payload WxEndOrderRequest request, @Headers Map<String, Object> map, Channel channel) {
        wxOrderInfoService.deviceEndOrder(request);
        channel.basicAck((Long) map.get(AmqpHeaders.DELIVERY_TAG), false);
    }
}