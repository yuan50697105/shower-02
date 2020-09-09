package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.util.Date;

/**
 * 设备订单信息（旧）
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceOrderInfo extends BaseDbEntity {
    /**
     * id
     */
    private Long id;

    /**
     * createTime
     */
    private Date createDate;

    /**
     * updateTime
     */
    private Date updateDate;

    /**
     * createUser
     */
    private Long creator;

    /**
     * updateUser
     */
    private Long updater;

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