package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import lombok.*;

import java.io.Serializable;

/**
 * device_order_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceOrderInfo extends BaseDbEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public static DeviceOrderInfoBuilder builder() {
        return new DeviceOrderInfoBuilder();
    }
}