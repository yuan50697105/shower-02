package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.commons.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
public class OrderInfo extends BaseEntity implements Serializable {
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