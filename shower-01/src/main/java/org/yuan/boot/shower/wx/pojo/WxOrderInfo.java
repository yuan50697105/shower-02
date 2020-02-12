package org.yuan.boot.shower.wx.pojo;

import lombok.Data;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:40
 */
@Data
public class WxOrderInfo {
    private Long orderId;
    private Long deviceId;
    private Long customerId;
    private String customerOpenId;
    private String customerUnionId;
    private String rangeCode;
}