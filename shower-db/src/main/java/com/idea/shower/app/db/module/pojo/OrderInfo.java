package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

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
     * 1:普通订单（现场使用)
     * 2:预约订单
     * @see com.idea.shower.app.db.module.constants.OrderInfoConstants.OrderType
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

    private static final long serialVersionUID = 1L;

    public static OrderInfoBuilder builder() {
        return new OrderInfoBuilder();
    }
}