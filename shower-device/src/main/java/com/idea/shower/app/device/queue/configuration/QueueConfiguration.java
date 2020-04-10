package com.idea.shower.app.device.queue.configuration;

import com.idea.shower.amqp.configuration.QueueConstants;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-09 20:48
 */
@Configuration
public class QueueConfiguration {

    @Bean(QueueConstants.EXCHANGE)
    public TopicExchange exchange() {
        return new TopicExchange(QueueConstants.EXCHANGE);
    }

    @Bean(QueueConstants.QUEUE_OPEN_ROOM)
    public Queue queueOpenRoom() {
        return new Queue(QueueConstants.QUEUE_OPEN_ROOM);
    }

    @Bean(QueueConstants.QUEUE_WATER_USE)
    public Queue queueWaterUse() {
        return new Queue(QueueConstants.TOPIC_GET_WATER_USE);
    }

    @Bean(QueueConstants.BINDING_OPEN_ROOM)
    public Binding bindingOpenRoom() {
        return BindingBuilder.bind(queueOpenRoom()).to(exchange()).with(QueueConstants.TOPIC_OPEN_ROOM);
    }

    @Bean(QueueConstants.BINDING_WATER_USE)
    public Binding bindingWaterUse() {
        return BindingBuilder.bind(queueWaterUse()).to(exchange()).with(QueueConstants.TOPIC_GET_WATER_USE);
    }

}