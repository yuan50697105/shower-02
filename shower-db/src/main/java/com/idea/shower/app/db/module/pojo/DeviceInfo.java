package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.commons.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceInfo extends BaseEntity implements Serializable {
    /**
     * 设备编号
     */
    private String code;

    /**
     * 设备类型 1 室外 2 室内
     */
    private Integer type;

    /**
     * 地址
     */
    private String address;

    /**
     * GPS
     */
    private String point;

    /**
     * 启用装填（1 启用 0 停用）
     */
    private Integer enabled;

    /**
     * 地区码
     */
    private String rangeCode;

    /**
     * 纬度 范围为 -90~90 负数表示南纬
     */
    private Double latitude;

    /**
     * 经度，范围为 -180~180，负数表示西经
     */
    private Double longitude;

    /**
     * 位置的精确度
     */
    private Double accuracy;

    /**
     * 高度，单位 m
     */
    private Double altitude;

    /**
     * 垂直精度，单位 m（Android 无法获取，返回 0）
     */
    private Double verticalAccuracy;

    /**
     * 水平精度，单位 m
     */
    private Double horizontalAccuracy;

    private static final long serialVersionUID = 1L;
}