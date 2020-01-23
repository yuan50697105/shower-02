package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 10:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WxOrderItem extends BaseEntity implements Serializable {
    /**
     * 订单ID
     */
    private Long orderId;
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
     * 子订单号
     */
    private String itemOrderNo;
    /**
     * 设备ID
     */
    private String deviceId;
    /**
     * 设备编号
     */
    private String deviceCode;
    /**
     * 支付状态（0 未支付 1 已支付）
     */
    private Integer payStatus;
    /**
     * 支付时间
     */
    private Date payTime;
    /**
     * 开始使用时间
     */
    private Date startTime;
    /**
     * 结束使用时间
     */
    private Date endTime;
    /**
     * 单价
     */
    private BigDecimal price;
    /**
     * 总价
     */
    private BigDecimal totalPrice;
    /**
     * 退回总金额
     */
    private BigDecimal totalRemainPrice;
}