package org.yuan.boot.webmvc.app.pojo.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-14 22:09
 */
@Data
@Accessors(chain = true)
public final class WxUserOrderVo {
    private String openId;
    private String deviceCode;
    private BigDecimal price;
}