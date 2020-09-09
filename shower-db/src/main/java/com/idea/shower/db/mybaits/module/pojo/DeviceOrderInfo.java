package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

/**
 * 设备订单信息（旧）
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceOrderInfo extends BaseDbEntity {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_DATE = "create_date";
    public static final String COL_UPDATE_DATE = "update_date";
    public static final String COL_CREATOR = "creator";
    public static final String COL_UPDATER = "updater";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_DEVICE_ID = "device_id";
    public static final String COL_DEVICE_CODE = "device_code";
    public static final String COL_ORDER_ID = "order_id";
    public static final String COL_ORDER_NO = "order_no";
    public static final String COL_STATUS = "status";
    public static final String COL_CONTENT = "content";
    private static final long serialVersionUID = 1L;
    private String delFlag;

    /**
     * 设备ID
     */
    private Long deviceId;

    /**
     * 设备编号
     */
    private String deviceCode;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 设备订单状态
     */
    private Integer status;

    /**
     * 详情
     */
    private String content;
}