package com.idea.shower.amqp.consumer;

import com.idea.shower.amqp.constants.QueueConstants;
import com.idea.shower.amqp.pojo.WxOrderDeviceProducerDTO;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-18 21:51
 */
@RabbitListener(queues = QueueConstants.ADD_ORDER_QUEUE)
@Component
@ConditionalOnExpression("${shower.module}=='device'")
public class DeviceOrderConsumer {
    @RabbitHandler
    public void onAddOrder(WxOrderDeviceProducerDTO wxOrderDeviceProducerDTO) {

    }

    @RabbitHandler
    public void onStopOrder(WxOrderDeviceProducerDTO wxOrderDeviceProducerDTO) {

    }


}