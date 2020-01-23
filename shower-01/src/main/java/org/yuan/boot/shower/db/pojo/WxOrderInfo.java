package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class WxOrderInfo extends BaseEntity implements Serializable {
    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 客户ID
     */
    private Long customerId;

    /**
     * 客户微信OPENID
     */
    private String customerOpenId;

    /**
     * 客户微信UNIONID
     */
    private String customerUnionId;

    /**
     * 客户昵称
     */
    private String customerNickName;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 总金额
     */
    private BigDecimal totalPrice;

    /**
     * 退回总金额
     */
    private BigDecimal totalRemainPrice;

    private static final long serialVersionUID = 1L;
}