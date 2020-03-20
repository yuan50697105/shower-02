package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem extends BaseDbEntity {
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
     * 地区码
     */
    private String rangeCode;

    /**
     * 定价ID
     */
    private Long goodsId;

    /**
     * 定价类型
     */
    private Integer goodsType;

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
}