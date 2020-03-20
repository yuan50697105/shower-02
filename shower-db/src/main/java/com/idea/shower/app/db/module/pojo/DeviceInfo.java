package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceInfo extends BaseDbEntity {
    /**
     * 设备编号
     */
    private String code;

    /**
     * 设备类型
     */
    private Integer type;

    /**
     * 地区码
     */
    private String rangeCode;

    /**
     * 启用状态
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
}