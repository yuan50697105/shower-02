package org.yuan.boot.shower.wx.pojo;

/**
 * @program: shower-01
 * @description: 订单状态
 * @author: yuane
 * @create: 2020-01-23 10:49
 */
public class WxOrderConstants {
    public static class OrderType {
        /**
         * 普通订单
         */
        public static final int COMMONS = 1;
        /**
         * 预支付订单
         */
        public static final int PREPAY = 2;
        /**
         * 预约订单
         */
        public static final int APPOINTMENT = 3;
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
     * 订单状态
     */
    public static class OrderStatus {
        /**
         * 下单
         */
        public static final int ADD = 0;
        /**
         * 支付
         */
        public static final int PAY = 11;
        /**
         * 预支付
         */
        public static final int PREPAY = 21;
        /**
         * 预约
         */
        public static final int APPOINTMENT = 31;
        /**
         * 订单完成
         */
        public static final int COMPLETE = 4;
    }
}