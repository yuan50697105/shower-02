package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
public class WxOrderInfo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 订单类型
     */
    private Integer type;
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
}