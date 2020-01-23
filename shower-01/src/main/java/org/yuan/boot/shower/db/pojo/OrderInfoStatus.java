package org.yuan.boot.shower.db.pojo;

/**
 * @program: shower-01
 * @description: 订单状态
 * @author: yuane
 * @create: 2020-01-23 10:49
 */
public class OrderInfoStatus {
    /**
     * 支付状态
     */
    public static class PayStatus {
        /**
         * 未支付
         */
        public static final Integer NO_PAY = 0;
        /**
         * 已支付
         */
        public static final Integer PAY = 1;
    }

    /**
     * 订单状态
     */
    public static class OrderStatus {
        /**
         * 下单
         */
        public static final Integer ADD = 0;
        /**
         * 支付
         */
        public static final Integer PAY = 11;
        /**
         * 预支付
         */
        public static final Integer PREPAY = 21;
        /**
         * 预约
         */
        public static final Integer APPOINTMENT = 31;
        /**
         * 订单完成
         */
        public static final Integer COMPLETE = 4;
    }
}