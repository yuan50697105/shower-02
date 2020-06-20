package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
public class OrderInfo extends BaseDbEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;
}