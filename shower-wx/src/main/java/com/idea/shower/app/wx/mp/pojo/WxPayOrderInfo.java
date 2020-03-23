package com.idea.shower.app.wx.mp.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 21:59
 */
@Data
public class WxPayOrderInfo {
    private String orderNo;
    private BigDecimal totalPrice;
}