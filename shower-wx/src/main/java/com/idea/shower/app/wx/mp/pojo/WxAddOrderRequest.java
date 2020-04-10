package com.idea.shower.app.wx.mp.pojo;

import lombok.Data;

/**
 * @program: learning-demo-java-01
 * @description: 微信订单实体
 * @author: yuane
 * @create: 2020-02-14 13:28
 */
@Data
public class WxAddOrderRequest {
    /**
     * 用户ID
     */
    private String openId;
    /**
     * 设备编号
     */
    private String deviceCode;
    /**
     * 订单类型
     * @see com.idea.shower.app.db.module.constants.OrderInfoConstants.OrderType
     */
    private Integer type;
}