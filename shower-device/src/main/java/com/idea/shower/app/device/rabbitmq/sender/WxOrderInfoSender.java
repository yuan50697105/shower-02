package com.idea.shower.app.device.rabbitmq.sender;

import com.idea.shower.commons.pojo.WxUseOrderRequest;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-28 18:50
 */
public interface WxOrderInfoSender {

    void endOrder(WxUseOrderRequest request);
}