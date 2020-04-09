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
    public Queue queue() {
        return new Queue(QueueConstants.QUEUE_OPEN_ROOM);
    }

    @Bean(QueueConstants.BINDING)
    public Binding binding() {
        return BindingBuilder.bind(queue()).to(exchange()).with(QueueConstants.TOPIC_OPEN_ROOM);
    }
}