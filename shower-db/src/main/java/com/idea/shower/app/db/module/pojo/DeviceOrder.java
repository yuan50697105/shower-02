package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
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
    private static final long serialVersionUID = 1L;
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

    public static DeviceOrderBuilder builder() {
        return new DeviceOrderBuilder();
    }
}