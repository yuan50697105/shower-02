package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * price_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PriceInfo extends BaseDbEntity {
    /**
     * id
     */
    private Long id;

    /**
     * createTime
     */
    private Date createDate;

    /**
     * updateTime
     */
    private Date updateDate;

    /**
     * createUser
     */
    private Long creator;

    /**
     * updateUser
     */
    private String updater;

    private String delFlag;

    /**
     * 编号
     */
    private String code;

    /**
     * 类型
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
     */
    private Integer waterUnit;

    /**
     * 有效
     */
    private Integer enabled;
}