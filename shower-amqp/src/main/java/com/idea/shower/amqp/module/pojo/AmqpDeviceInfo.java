package com.idea.shower.amqp.module.pojo;

import lombok.Data;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-09 20:35
 */
@Data
public class AmqpDeviceInfo {
    private String deviceCode;
    private Long deviceId;
    private String orderNo;
    private Long orderId;
    private String openId;
}