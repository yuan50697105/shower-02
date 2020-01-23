package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

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