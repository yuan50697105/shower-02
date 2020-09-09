package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * order_item
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem extends BaseDbEntity {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_DATE = "create_date";
    public static final String COL_UPDATE_DATE = "update_date";
    public static final String COL_CREATOR = "creator";
    public static final String COL_UPDATER = "updater";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_ORDER_ID = "order_id";
    public static final String COL_ORDER_NO = "order_no";
    public static final String COL_DEVICE_ID = "device_id";
    public static final String COL_DEVICE_CODE = "device_code";
    public static final String COL_DEVICE_TYPE = "device_type";
    public static final String COL_PRICE_CODE = "price_code";
    public static final String COL_PRICE_ID = "price_id";
    public static final String COL_PRICE_TYPE = "price_type";
    public static final String COL_TIME_PRICE = "time_price";
    public static final String COL_TIME_INTERVAL = "time_interval";
    public static final String COL_TIME_UNIT = "time_unit";
    public static final String COL_START_TIME = "start_time";
    public static final String COL_END_TIME = "end_time";
    public static final String COL_TIME_USE = "time_use";
    public static final String COL_WATER_PRICE = "water_price";
    public static final String COL_WATER_INTERVAL = "water_interval";
    public static final String COL_WATER_UNIT = "water_unit";
    public static final String COL_WATER_USE = "water_use";
    public static final String COL_TOTAL_PRICE = "total_price";
    private static final long serialVersionUID = 1L;
    private String delFlag;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 设备ID
     */
    private Long deviceId;

    /**
     * 设备编号
     */
    private String deviceCode;

    /**
     * 设备类型
     */
    private Integer deviceType;

    /**
     * 价格码
     */
    private String priceCode;

    /**
     * 定价ID
     */
    private Long priceId;

    /**
     * 定价类型
     */
    private Integer priceType;

    /**
     * 时间价格
     */
    private BigDecimal timePrice;

    /**
     * 时间计费间隔
     */
    private Double timeInterval;

    /**
     * 时间计费单位
     */
    private Integer timeUnit;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 用时
     */
    private Double timeUse;

    /**
     * 水价
     */
    private BigDecimal waterPrice;

    /**
     * 水计费间隔
     */
    private Double waterInterval;

    /**
     * 水计费单位
     */
    private Integer waterUnit;

    /**
     * 水用量
     */
    private Double waterUse;

    /**
     * 总价
     */
    private BigDecimal totalPrice;
}