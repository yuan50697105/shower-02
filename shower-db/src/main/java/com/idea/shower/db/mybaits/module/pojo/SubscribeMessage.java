package com.idea.shower.db.mybaits.module.pojo;

import io.renren.common.entity.BaseEntity;
import lombok.*;

import java.util.Date;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-25 19:48
 */
@EqualsAndHashCode(callSuper = true)
@Data
//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@With
@Builder
public class SubscribeMessage extends BaseEntity {
    /**
     * 产品编号
     */
    private String productKey;
    /**
     * 设备名称
     */
    private String deviceName;
    /**
     * 消息ID
     */
    private String messageId;
    /**
     * 操作
     */
    private String operating;
    /**
     * 接收时间
     */
    private Date receivingTime;
    /**
     * 经度
     */
    private String longitude;
    /**
     * 纬度
     */
    private String latitude;
    /**
     * 工作状态
     */
    private String workingStatus;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 工作时间
     */
    private String workingTime;
    /**
     * 暖风开启时间
     */
    private String warmAirOnTime;
    /**
     * 门状态
     */
    private String doorStatus;
    /**
     * 淋浴水阀状态
     */
    private String showerValveStatus;
    /**
     * 冲洗水阀状态
     */
    private String flushingWaterValveStatus;
    /**
     * 暖风状态
     */
    private String warmAirCondition;
    /**
     * 换气扇状态
     */
    private String ventilatorStatus;
    /**
     * 串口1状态
     */
    private String serial1Status;
    /**
     * 串口2状态
     */
    private String serial2Status;
    /**
     * 是否有人状态
     */
    private String hasSomeoneStatus;
}