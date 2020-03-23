package com.idea.shower.app.db.module.constants.device;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 22:48
 */
public class DeviceOrderStatus {
    /**
     * 添加订单
     */
    public static final int ADD_ORDER = 1;
    /**
     * 预约
     */
    public static final int RESERVED = 2;
    /**
     * 使用中
     */
    public static final int USING = 31;
    /**
     * 结束使用
     */
    public static final int END_USE = 32;

    /**
     * 已支付
     */
    public static final int PAID = 4;
    /**
     * 订单完成
     */
    public static final int ORDER_COMPLETED = 5;

}