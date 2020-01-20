package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 17:59
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class DeviceOrderInfo extends BaseEntity<DeviceOrderInfo> implements Serializable {
    /**
     * 设备ID
     */
    private Long deviceId;
    /**
     * 设备编号
     */
    private String deviceCode;
    /**
     * 订单ID
     */
    private Long orderId;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 客户ID
     */
    private Long customerId;
    /**
     * 客户微信OpenId
     */
    private String customerOpenId;
    /**
     * 客户姓名
     */
    private String customerName;
    /**
     * 下单时间
     */
    private Date orderTime;
    /**
     * 开始使用时间
     */
    private Date startTime;
    /**
     * 结束使用时间
     */
    private Date endTime;
    /**
     * 离开时间
     */
    private Date leaveTime;
}