package com.idea.shower.app.commons.db.module.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.app.commons.pojo.BaseDbEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class OrderInfo extends BaseDbEntity implements Serializable {
    /**
     * type
     */
    private Integer type;

    /**
     * orderNo
     */
    private String orderNo;

    /**
     * customerId
     */
    private Long customerId;

    /**
     * customerOpenId
     */
    private String customerOpenId;

    /**
     * customerUnionId
     */
    private String customerUnionId;

    /**
     * customerNickName
     */
    private String customerNickName;

    /**
     * orderStatus
     */
    private Integer orderStatus;

    /**
     * totalPrice
     */
    private BigDecimal totalPrice;

    private static final long serialVersionUID = 1L;
}