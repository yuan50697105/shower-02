package com.idea.shower.amqp.pojo;

import lombok.Builder;
import lombok.Data;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-18 21:36
 */
@Data
@Builder
public class WxOrderDeviceProducerDTO {
    private Long orderId;
    private String orderNo;
    private String deviceCode;
}