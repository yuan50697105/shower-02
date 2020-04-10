package com.idea.shower.app.wx.mp.pojo;

import lombok.Data;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-01 21:16
 */
@Data
public class WxUseOrderRequest {
    private String orderNo;
    private String openId;
    private String deviceCode;
}