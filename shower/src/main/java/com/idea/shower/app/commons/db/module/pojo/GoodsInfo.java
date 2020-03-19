package com.idea.shower.app.commons.db.module.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.app.commons.pojo.BaseDbEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class GoodsInfo extends BaseDbEntity implements Serializable {
    /**
     * 商品编号
     */
    private String code;

    /**
     * type (类型 1 起租 2 额外收费）
     */
    private Integer type;

    /**
     * 使用时间定价
     */
    private BigDecimal timePrice;

    /**
     * 使用时间计费间隔
     */
    private BigDecimal timeInterval;

    /**
     * 时间计费单位
     */
    private Integer timeUnit;

    /**
     * 水费单价
     */
    private BigDecimal waterPrice;

    /**
     * 水费计费间隔
     */
    private BigDecimal waterSpace;

    /**
     * 水费计费单位
     */
    private Integer waterUnit;

    /**
     * 地区码
     */
    private String rangeCode;

    private static final long serialVersionUID = 1L;
}