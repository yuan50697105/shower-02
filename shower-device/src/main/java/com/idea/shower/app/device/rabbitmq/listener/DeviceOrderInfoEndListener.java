package com.idea.shower.app.device.rabbitmq.listener;

import com.idea.shower.app.device.service.control.DeviceProcessService;
import com.idea.shower.commons.constants.Queues;
import com.idea.shower.commons.pojo.DeviceOrderDto;
import com.idea.shower.db.mybaits.module.dao.DeviceInfoDao;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfo;
import com.rabbitmq.client.Channel;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-28 15:52
 */
@Component
@RabbitListener(queues = Queues.QUEUE_DEVICE_ORDER_END)
@Slf4j
public class DeviceOrderInfoEndListener {
    @Autowired
    private DeviceProcessService deviceProcessService;
    @Autowired
    private DeviceInfoDao deviceInfoDao;

    @SneakyThrows
    @RabbitHandler
    public void addOrder(@Payload DeviceOrderDto deviceOrderDto, @Headers Map<String, Object> headers, Channel channel, Message message) {
        log.info(deviceOrderDto.toString());
        deviceProcessService.addOrder(deviceOrderDto);
        String messageId = message.getMessageProperties().getMessageId();
        log.info("messageId:" + messageId);
        Optional<DeviceInfo> deviceInfoOptional = deviceInfoDao.getByIdOpt(deviceOrderDto.getDeviceId());
        if (deviceInfoOptional.isPresent()) {
            DeviceInfo deviceInfo = deviceInfoOptional.get();
            deviceProcessService.
        } else {
            throw new AmqpException("设备异常");
        }
//        String messageId = (String) headers.get(AmqpHeaders.CORRELATION_ID);
        channel.basicAck((Long) headers.get(AmqpHeaders.DELIVERY_TAG), false);
    }
}