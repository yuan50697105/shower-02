package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo extends BaseDbEntity {
    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单类型
     */
    private String type;

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
     * 总价
     */
    private BigDecimal totalPrice;

    /**
     * 订单状态
     */
    private Integer status;

    public static OrderInfoBuilder builder() {
        return new OrderInfoBuilder();
    }
}