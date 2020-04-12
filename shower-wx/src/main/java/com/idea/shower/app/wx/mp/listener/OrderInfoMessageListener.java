package com.idea.shower.app.wx.mp.listener;

import com.idea.shower.app.db.module.dao.OrderInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-09 21:06
 */
@Component
public class OrderInfoMessageListener extends KeyExpirationEventMessageListener {
    @Autowired
    private OrderInfoDao orderInfoDao;

    /**
     * Creates new {@link MessageListener} for {@code __keyevent@*__:expired} messages.
     *
     * @param listenerContainer must not be {@literal null}.
     */
    public OrderInfoMessageListener(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);
    }

    @Override
    public void onMessage(Message message, byte[] pattern) {
        super.onMessage(message, pattern);
    }
}