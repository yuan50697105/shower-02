package com.idea.shower.app.device.rabbitmq.listener;

import com.idea.shower.app.device.service.DeviceProcessService;
import com.idea.shower.commons.constants.Queues;
import com.idea.shower.commons.pojo.DeviceOrderDto;
import com.rabbitmq.client.Channel;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-28 15:52
 */
@Component
@RabbitListener(queues = Queues.QUEUE_DEVICE_ORDER_ADD)
@Slf4j
public class DeviceOrderInfoListener {
    @Autowired
    private DeviceProcessService deviceProcessService;

    @SneakyThrows
    @RabbitHandler
    public void addOrder(@Payload DeviceOrderDto deviceOrderDto, @Headers Map<String, Object> headers, Channel channel) {
        log.info(deviceOrderDto.toString());
        deviceProcessService.addOrder(deviceOrderDto);
//        String messageId = (String) headers.get(AmqpHeaders.CORRELATION_ID);
        channel.basicAck((Long) headers.get(AmqpHeaders.DELIVERY_TAG), false);
    }
}