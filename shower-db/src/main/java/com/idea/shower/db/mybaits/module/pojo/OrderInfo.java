package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * order_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo extends BaseDbEntity {
    /**
     * id
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 创建人
     */
    private Long creator;

    /**
     * 修改人
     */
    private Long updater;

    private String delFlag;

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