package com.idea.shower.app.device.pojo.dto;

import lombok.Data;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-17 22:45
 */
@Data
public class DeviceAddOrderDto {
    private Long deviceId;
    private String orderNo;
    private String customerOpenId;
    private Long customerId;
}