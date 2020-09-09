package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.util.Date;

/**
 * device_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceInfo extends BaseDbEntity {
    /**
     * id
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 修改人
     */
    private Long updater;

    /**
     * 创建人
     */
    private Long creator;

    private String delFlag;

    /**
     * 设备编号
     */
    private String code;

    /**
     * 产品编号
     */
    private String productKey;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备类型
     */
    private Integer type;

    /**
     * 定价编号
     */
    private String priceCode;

    /**
     * 启用状态(0:未启用；1已启用)
     */
    private Integer enabled;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 区域ID
     */
    private Long areaId;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 楼宇ID
     */
    private Long buildingId;

    /**
     * 楼宇名称
     */
    private String buildingName;

    /**
     * 设备图片
     */
    private String picture;

    /**
     * 运行状态 0 可用 1 使用中
     */
    private Integer runStatus;
}