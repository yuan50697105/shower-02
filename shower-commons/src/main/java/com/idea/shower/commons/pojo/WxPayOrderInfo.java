package com.idea.shower.commons.pojo;

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

    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 总价
     */
    private BigDecimal totalPrice;
}