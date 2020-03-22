package com.idea.shower.app.wx.mp.pojo;

import lombok.Data;

/**
 * @program: learning-demo-java-01
 * @description: 微信订单实体
 * @author: yuane
 * @create: 2020-02-14 13:28
 */
@Data
public class WxOrderInfo {
    private String unionId;
    private String openId;
    private Long orderId;
    private String orderNo;
    private String rangeCode;
    private Long deviceId;
    private String deviceCode;
    private Integer type;
    private Double waterUse;
}