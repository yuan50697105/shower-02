package com.idea.shower.amqp.commons.sender.impl;

import com.idea.shower.amqp.commons.sender.BaseSender;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-01 20:51
 */
public abstract class BaseSenderImpl<T> implements BaseSender<T> {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void send(String routeKey, T t) {
        rabbitTemplate.convertAndSend(routeKey, t);
    }

    @Override
    public void send(String exchange, String routeKey, T t) {
        rabbitTemplate.convertAndSend(exchange, routeKey, t);
    }

    @Override
    public Object sendAndRec(String routeKey, T t) {
        return rabbitTemplate.convertSendAndReceive(routeKey, t);
    }

    @Override
    public Object sendAndRec(String exchange, String routeKey, T t) {
        return rabbitTemplate.convertSendAndReceive(exchange, routeKey, t);
    }
}