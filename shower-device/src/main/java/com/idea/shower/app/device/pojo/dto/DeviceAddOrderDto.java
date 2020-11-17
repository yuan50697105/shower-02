package com.idea.shower.app.device.pojo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-17 22:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeviceAddOrderDto extends BaseMessageDto {
    private Long deviceId;
    private String orderNo;
    private String customerOpenId;
    private Long customerId;
}