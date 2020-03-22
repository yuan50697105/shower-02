package com.idea.shower.amqp.producer;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-18 21:33
 */
public interface BaseProducer<T> {
    void send(String route, T t);

    void send(String exchange, String route, T t);
}