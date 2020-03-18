package com.idea.shower.amqp.producer.impl;

import com.idea.shower.amqp.producer.BaseProducer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-18 21:33
 */
@Component
@Transactional
public class BaseProducerImpl<T> implements BaseProducer<T> {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void send(String route, T t) {
        rabbitTemplate.convertAndSend(route, t);
    }

    @Override
    public void send(String exchange, String route, T t) {
        rabbitTemplate.convertAndSend(exchange, route, t);
    }
}