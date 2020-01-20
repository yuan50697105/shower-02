package org.yuan.boot.shower.wx.pojo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:29
 */
@Data
public class WxOrderVO {
    @NotEmpty
    private Integer type;
    @NotEmpty
    private String openId;
    @NotEmpty
    private String unionId;
    @NotEmpty
    private String deviceCode;
    private BigDecimal decimal;
}