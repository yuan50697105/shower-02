package com.idea.shower.db.mybaits.module.pojo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.math.BigDecimal;

/**
 * price_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PriceInfo extends BaseDbEntity {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_DATE = "create_date";
    public static final String COL_UPDATE_DATE = "update_date";
    public static final String COL_CREATOR = "creator";
    public static final String COL_UPDATER = "updater";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_CODE = "code";
    public static final String COL_TYPE = "type";
    public static final String COL_PRICE_CODE = "price_code";
    public static final String COL_TIME_PRICE = "time_price";
    public static final String COL_TIME_INTERVAL = "time_interval";
    public static final String COL_TIME_UNIT = "time_unit";
    public static final String COL_WATER_PRICE = "water_price";
    public static final String COL_WATER_INTERVAL = "water_interval";
    public static final String COL_WATER_UNIT = "water_unit";
    public static final String COL_ENABLED = "enabled";
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

    public void copyFromByOptions(BaseDbEntity t, CopyOptions copyOptions) {
        BeanUtil.copyProperties(t, this, copyOptions);
    }
}