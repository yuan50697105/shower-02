package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.shower.commons.interceptor.annotation.CreateTime;
import org.yuan.boot.shower.commons.interceptor.annotation.UpdateTime;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: shower-01
 * @description: 微信订单信息
 * @author: yuane
 * @create: 2020-01-20 16:38
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class WxOrderInfo extends BaseEntity<WxOrderInfo> implements Serializable {
    @CreateTime
    private Date createTime;
    /**
     * 订单类型 1 预支付押金，2 直接使用 ，3 预约订单
     */
    private Integer orderType;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 客户ID
     */
    private Long customerId;
    /**
     * 客户姓名
     */
    private String customerName;
    /**
     * 客户微信openId
     */
    private String customerOpenId;
    /**
     * 设备编号ID
     */
    private Long deviceId;
    /**
     * 设备编号
     */
    private String deviceCode;
    /**
     * 支付状态 （0未支付 ，11 预支付订单支付定金， 12 使用结束未完成支付，13 使用完成并完成支付，22使用结束未支付，23 完成支持，31 ，32 ，33
     */
    private Integer payStatus;
    /**
     * 预支付时间
     */
    private Date predicatePayTime;
    /**
     * 使用结束支付时间
     */
    private Date finalPayTime;
    /**
     * 预支付金额
     */
    private BigDecimal predicateDecimal;
    /**
     * 预支付剩余金额
     */
    private BigDecimal remainDecimal;
    /**
     * 使用开始时间
     */
    private Date startTime;
    /**
     * 使用结束时间
     */
    private Date endTime;
    /**
     * 使用时间
     */
    private BigDecimal spendTime;
    /**
     * 最低收费
     */
    private BigDecimal minDecimal;
    /**
     * 单位收费价格
     */
    private BigDecimal perDecimal;
    /**
     * 超出收费金额（如果是直接使用订单，只有超出使用金额）
     */
    private BigDecimal extDecimal;
    /**
     * 总金额
     */
    private BigDecimal totalDecimal;
    /**
     * 客户离开时间
     */
    private Date leaveTime;
    @CreateTime
    private Date crateTime;
    @UpdateTime
    private Date updateTime;

}