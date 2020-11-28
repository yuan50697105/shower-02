package com.idea.shower.app.wx.mp.rabbitmq;

import com.idea.shower.commons.constants.Queues;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-28 15:39
 */
@Configuration
public class QueueConfiguration {

    @Bean(Queues.QUEUE_DEVICE_ORDER_ADD)
    public Queue queue() {
        return QueueBuilder.nonDurable(Queues.QUEUE_DEVICE_ORDER_ADD).build();
    }

    @Bean(Queues.QUEUE_WX_ORDER_END)
    public Queue queue1() {
        return QueueBuilder.nonDurable(Queues.QUEUE_WX_ORDER_END).build();
    }
}