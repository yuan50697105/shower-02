package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceInfo extends BaseDbEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 设备编号
     */
    private String code;
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

    public static DeviceInfoBuilder builder() {
        return new DeviceInfoBuilder();
    }
}