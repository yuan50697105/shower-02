package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.io.Serializable;

/**
 * device_info_volume
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceInfoVolume extends BaseDbEntity implements Serializable {
    /**
     * 设备ID
     */
    private Long deviceId;

    /**
     * 热水容量
     */
    private Double volume;

    private static final long serialVersionUID = 1L;
}