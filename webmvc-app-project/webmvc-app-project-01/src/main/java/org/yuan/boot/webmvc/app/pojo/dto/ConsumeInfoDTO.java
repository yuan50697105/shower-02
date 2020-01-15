package org.yuan.boot.webmvc.app.pojo.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: learning-demo-02
 * @description: 消费信息
 * @author: yuane
 * @create: 2020-01-15 22:13
 */
@Data
public final class ConsumeInfoDTO {
    private String goodsCode;
    private String startTime;
    private String endTime;
    private BigDecimal price;
    private BigDecimal totalPrice;
    private String deviceCode;
}