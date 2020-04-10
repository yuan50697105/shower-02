package com.idea.shower.app.db.module.constants;

/**
 * @program: shower-01
 * @description: 订单状态常量
 * @author: yuane
 * @create: 2020-01-23 18:27
 */
public class OrderInfoConstants {
    /**
     * 订单状态
     */
    public static class OrderStatus {
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
        /**
         * 订单超时（预约订单使用）
         */
        public static final int ORDER_OUT_TIME = 6;

    }

    /**
     * 支付状态
     */
    public static class PayStatus {
        /**
         * 未支付
         */
        public static final int NO_PAY = 0;
        /**
         * 已支付
         */
        public static final int PAY = 1;
    }

    /**
     * 订单类型
     */
    public static class OrderType {
        /**
         * 普通订单（现场使用)
         */
        public static final int COMMONS = 1;
        /**
         * 预约订单
         */
        public static final int RESERVATION = 2;
    }

}