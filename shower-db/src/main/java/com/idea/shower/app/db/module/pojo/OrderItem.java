package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * order_item
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem extends BaseDbEntity {
    private static final long serialVersionUID = 1L;
    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 设备ID
     */
    private Long deviceId;

    /**
     * 设备编号
     */
    private String deviceCode;

    /**
     * 设备类型
     */
    private Integer deviceType;

    /**
     * 价格码
     */
    private String priceCode;

    /**
     * 定价ID
     */
    private Long priceId;

    /**
     * 定价类型
     */
    private Integer priceType;

    /**
     * 时间价格
     */
    private BigDecimal timePrice;

    /**
     * 时间计费间隔
     */
    private Double timeInterval;

    /**
     * 时间计费单位
     */
    private Integer timeUnit;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 用时
     */
    private Double timeUse;

    /**
     * 水价
     */
    private BigDecimal waterPrice;

    /**
     * 水计费间隔
     */
    private Double waterInterval;

    /**
     * 水计费单位
     */
    private Integer waterUnit;

    /**
     * 水用量
     */
    private Double waterUse;

    /**
     * 总价
     */
    private BigDecimal totalPrice;

    public static OrderItemBuilder builder() {
        return new OrderItemBuilder();
    }
}