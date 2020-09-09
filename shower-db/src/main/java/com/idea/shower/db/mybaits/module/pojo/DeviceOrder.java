package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * device_order
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceOrder extends BaseDbEntity {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_DATE = "create_date";
    public static final String COL_UPDATE_DATE = "update_date";
    public static final String COL_CREATOR = "creator";
    public static final String COL_UPDATER = "updater";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_DEVICE_ID = "device_id";
    public static final String COL_DEVICE_CODE = "device_code";
    public static final String COL_RANGE_CODE = "range_code";
    public static final String COL_DEVICE_TYPE = "device_type";
    public static final String COL_ORDER_ID = "order_id";
    public static final String COL_ORDER_NO = "order_no";
    public static final String COL_ORDER_TYPE = "order_type";
    public static final String COL_CUSTOMER_ID = "customer_id";
    public static final String COL_UNION_ID = "union_id";
    public static final String COL_OPEN_ID = "open_id";
    public static final String COL_STATUS = "status";
    public static final String COL_START_TIME = "start_time";
    public static final String COL_END_TIME = "end_time";
    /**
     * 设备ID
     */
    private Long deviceId;

    /**
     * 设备编号
     */
    private String deviceCode;

    /**
     * 地区码
     */
    private String rangeCode;

    /**
     * 设备类型
     */
    private Integer deviceType;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 订单类型
     */
    private Integer orderType;

    /**
     * 客户ID
     */
    private Long customerId;

    /**
     * 客户UNIONID
     */
    private String unionId;

    /**
     * 客户OPENID
     */
    private String openId;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 使用开始时间
     */
    private Date startTime;

    /**
     * 结束时间、离开时间
     */
    private Date endTime;
}