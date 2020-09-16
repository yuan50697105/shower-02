package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import java.math.BigDecimal;
import java.util.Date;

import io.renren.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * order_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo extends BaseEntity {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_DATE = "create_date";
    public static final String COL_UPDATE_DATE = "update_date";
    public static final String COL_CREATOR = "creator";
    public static final String COL_UPDATER = "updater";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_ORDER_NO = "order_no";
    public static final String COL_TYPE = "type";
    public static final String COL_CUSTOMER_ID = "customer_id";
    public static final String COL_CUSTOMER_OPEN_ID = "customer_open_id";
    public static final String COL_CUSTOMER_UNION_ID = "customer_union_id";
    public static final String COL_DEVICE_CODE = "device_code";
    public static final String COL_DEVICE_ID = "device_id";
    public static final String COL_TOTAL_PRICE = "total_price";
    public static final String COL_STATUS = "status";
    public static final String COL_USE_START_TIME = "use_start_time";
    public static final String COL_USE_END_TIME = "use_end_time";
    public static final String COL_TRANSACTION_ID = "transaction_id";
    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单类型
     */
    private Integer type;

    /**
     * 客户ID
     */
    private Long customerId;

    /**
     * 客户OPENID
     */
    private String customerOpenId;

    /**
     * 客户UNIONID
     */
    private String customerUnionId;

    /**
     * 设备号
     */
    private String deviceCode;

    /**
     * 设备ID
     */
    private Long deviceId;

    /**
     * 总价
     */
    private BigDecimal totalPrice;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 使用开始时间
     */
    private Date useStartTime;

    /**
     * 使用结束时间
     */
    private Date useEndTime;

    /**
     * 微信交易号
     */
    private String transactionId;
}