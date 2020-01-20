package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class DeviceOrderInfo implements Serializable {
    /**
     * id
     */
    private Long id;

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

    private static final long serialVersionUID = 1L;
}