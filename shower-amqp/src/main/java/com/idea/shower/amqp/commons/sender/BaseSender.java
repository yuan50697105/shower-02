package com.idea.shower.amqp.commons.sender;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-01 20:51
 */
public interface BaseSender<T> {
    void send(String routeKey, T t);

    void send(String exchange, String routeKey, T t);

    Object sendAndRec(String routeKey, T t);

    Object sendAndRec(String exchange, String routeKey, T t);
}
