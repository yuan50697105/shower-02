package org.yuan.boot.shower.wx.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

/**
 * @program: shower-01
 * @description: 微信订单模型
 * @author: yuane
 * @create: 2020-01-23 18:34
 */
@Data
@ApiModel("微信订单模型")
public class WxOrderInfo {
    /**
     * 订单类型
     */
    @NotEmpty
    private Integer type;
    /**
     * 客户ID
     */
    @NotEmpty
    private Long customerId;
    /**
     * 客户微信OPENID
     */
    private String customerOpenId;
    /**
     * 客户微信UNIONID
     */
    private String customerUnionId;
    /**
     * 预支付金额 预支付订单使用
     */
    @NotEmpty(groups = {OrderTypePrepay.class})
    @Min(value = 0, groups = {OrderTypePrepay.class})
    private BigDecimal prepayDecimal;

    public interface OrderTypeCommons {
    }

    public interface OrderTypePrepay {
    }

    public interface OrderTypeAppointment {
    }

}