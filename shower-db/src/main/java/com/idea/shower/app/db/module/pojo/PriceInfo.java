package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * price_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PriceInfo extends BaseDbEntity implements Serializable {
    /**
     * 编号
     */
    private String code;

    /**
     * 类型
     * @see com.idea.shower.app.db.module.constants.PriceInfoConstants.PriceType
     */
    private Integer type;

    /**
     * 地区码
     */
    private String priceCode;

    /**
     * 时间定价
     */
    private BigDecimal timePrice;

    /**
     * 时间计费间隔
     */
    private Double timeInterval;

    /**
     * 时间单位
     * @see com.idea.shower.app.db.module.constants.PriceInfoConstants.PriceTimeUnit
     */
    private Integer timeUnit;

    /**
     * 水定价
     */
    private BigDecimal waterPrice;

    /**
     * 水计费间隔
     */
    private Double waterInterval;

    /**
     * 水计费单位
     * @see com.idea.shower.app.db.module.constants.PriceInfoConstants.PriceWaterUnit
     */
    private Integer waterUnit;

    /**
     * 有效
     * @see com.idea.shower.app.db.module.constants.commons.EnableConstants
     */
    private Integer enabled;

    private static final long serialVersionUID = 1L;

    public static PriceInfoBuilder builder() {
        return new PriceInfoBuilder();
    }
}