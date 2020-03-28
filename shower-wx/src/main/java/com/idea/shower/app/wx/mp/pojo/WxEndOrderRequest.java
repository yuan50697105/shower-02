package com.idea.shower.app.wx.mp.pojo;

import lombok.Data;

/**
 * @program: shower-01
 * @description: 结束订单实体
 * @author: yuane
 * @create: 2020-03-28 19:53
 */
@Data
public class WxEndOrderRequest {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 用户ID
     */
    private String openId;
}