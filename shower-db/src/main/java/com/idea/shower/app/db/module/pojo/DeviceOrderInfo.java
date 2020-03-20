package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.commons.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceOrderInfo extends BaseEntity implements Serializable {
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
}