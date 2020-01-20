package org.yuan.boot.shower.wx.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:29
 */
@Data
public class WxOrderVO {
    private Integer type;
    private String openId;
    private String deviceCode;
    private BigDecimal decimal;
}