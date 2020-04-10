package com.idea.shower.amqp.module.pojo;

import lombok.Data;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-01 20:56
 */
@Data
public class OrderInfo {
    private Long orderId;
    private Long deviceId;
    private String deviceStatus;
}