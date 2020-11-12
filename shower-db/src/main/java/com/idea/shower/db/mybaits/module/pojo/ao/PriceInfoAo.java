package com.idea.shower.db.mybaits.module.pojo.ao;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class PriceInfoAo implements Serializable {
    /**
     *
     */

    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private Long id;
    /**
     *
     */
    private Date createDate;
    /**
     *
     */
    private Date updateDate;
    /**
     *
     */
    private Long creator;
    /**
     *
     */
    private String updater;
    /**
     *
     */
    private String delFlag;
    /**
     *
     */
    private String code;
    /**
     *
     */
    private Integer type;
    /**
     *
     */
    private String priceCode;
    /**
     *
     */
    private BigDecimal timePrice;
    /**
     *
     */
    private Double timeInterval;
    /**
     *
     */
    private Integer timeUnit;
    /**
     *
     */
    private BigDecimal waterPrice;
    /**
     *
     */
    private Double waterInterval;
    /**
     *
     */
    private Integer waterUnit;
    /**
     *
     */
    private Integer enabled;
    /**
     *
     */
    private Long areaId;
    /**
     *
     */
    private String name;
}

