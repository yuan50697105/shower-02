package com.idea.shower.app.db.module.constants.order;

/**
 * @program: learning-demo-java-01
 * @description: 订单状态常量
 * @author: yuane
 * @create: 2020-02-14 15:34
 */
public class OrderStatus {
    /**
     * 下单
     */
    public static final int ADD_ORDER = 1;
    /**
     * 使用中
     */
    public static final int USING = 2;
    /**
     * 解释使用
     */
    public static final int END_USE = 3;
    /**
     * 已支付
     */
    public static final int PAID = 4;
    /**
     * 订单完成
     */
    public static final int ORDER_COMPLETED = 5;

}