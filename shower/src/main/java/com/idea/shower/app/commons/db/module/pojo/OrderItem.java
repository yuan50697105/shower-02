package com.idea.shower.app.commons.db.module.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.app.commons.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class OrderItem extends BaseEntity implements Serializable {
    /**
     * 订单类型
     */
    private Integer type;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 客户ID
     */
    private Long customerId;

    /**
     * 微信OPENID
     */
    private String customerOpenId;

    /**
     * 微型UNIONID
     */
    private String customerUnionId;

    /**
     * 昵称
     */
    private String customerNickName;

    /**
     * 订单项目类型
     */
    @Deprecated
    private Integer itemType;

    /**
     * 子订单号
     */
    @Deprecated
    private String itemOrderNo;

    /**
     * 设备类型
     */
    private Integer deviceType;

    /**
     * 设备ID
     */
    private Long deviceId;

    /**
     * 设备编号
     */
    private String deviceCode;

    /**
     * 读取码
     */
    private String rangeCode;

    /**
     * 价目ID
     */
    private Long goodsInfoId;

    /**
     * 价目编号
     */
    private String goodsInfoCode;

    /**
     * 时间定价
     */
    private BigDecimal timePrice;

    /**
     * 时间计费间隔
     */
    private BigDecimal timeInterval;

    /**
     * 时间用时总价
     */
    private BigDecimal timeTotalPrice;

    /**
     * 时间定价单位
     */
    private Integer timePriceUnit;

    /**
     * startTime
     */
    private Date startTime;

    /**
     * endTime
     */
    private Date endTime;

    /**
     * 时间使用量
     */
    private BigDecimal timeUseAmount;

    /**
     * 水定价
     */
    private BigDecimal waterPrice;

    /**
     * 水费计费间隔
     */
    private BigDecimal waterSpace;

    /**
     * 水费单位
     */
    private Integer waterUnit;

    /**
     * 总水费
     */
    private BigDecimal waterTotalPrice;

    /**
     * 总价
     */
    private BigDecimal totalPrice;

    /**
     * 充值剩余金额
     */
    private BigDecimal remainPrice;

    private static final long serialVersionUID = 1L;
}