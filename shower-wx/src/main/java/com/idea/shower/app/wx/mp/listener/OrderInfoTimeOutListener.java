package com.idea.shower.app.wx.mp.listener;

import com.idea.shower.app.db.module.dao.DeviceOrderDao;
import com.idea.shower.app.db.module.dao.OrderInfoDao;
import com.idea.shower.redis.module.order.dao.OrderRedisDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-20 21:33
 */
@Component
@Slf4j
public class OrderInfoTimeOutListener extends KeyExpirationEventMessageListener {
    @Autowired
    private OrderInfoDao orderInfoDao;
    @Autowired
    private DeviceOrderDao deviceOrderDao;

    /**
     * Creates new {@link MessageListener} for {@code __keyevent@*__:expired} messages.
     *
     * @param listenerContainer must not be {@literal null}.
     */
    public OrderInfoTimeOutListener(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);
    }

    @Override
    public void onMessage(Message message, byte[] pattern) {
        String expiredKey = message.toString();
        if (expiredKey.startsWith(OrderRedisDao.ORDER_INFO_RESERVATION)) {
            udpateReservationOrderCancel(message);
        }
    }

    private void updateOrderNotCacel(Message message) {
        Long orderId = Long.valueOf(new String(message.getBody(), StandardCharsets.UTF_8).replace(OrderRedisDao.ORDER_INFO_COMMONS, ""));
    }

    private void udpateReservationOrderCancel(Message message) {
        //如果是Order:开头的key，进行处理
        Long orderId = Long.valueOf(new String(message.getBody(), StandardCharsets.UTF_8).replace(OrderRedisDao.ORDER_INFO_RESERVATION, ""));
        log.info(orderId + "超时");
        orderInfoDao.updateStatusTimeOutById(orderId);
        deviceOrderDao.updateStatusTimeOutByOrderId(orderId);
    }
}