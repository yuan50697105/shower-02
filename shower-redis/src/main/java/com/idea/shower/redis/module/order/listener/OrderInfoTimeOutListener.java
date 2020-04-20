package com.idea.shower.redis.module.order.listener;

import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-20 21:33
 */
@Component
public class OrderInfoTimeOutListener extends KeyExpirationEventMessageListener {
    /**
     * Creates new {@link MessageListener} for {@code __keyevent@*__:expired} messages.
     *
     * @param listenerContainer must not be {@literal null}.
     */
    public OrderInfoTimeOutListener(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);
    }
}