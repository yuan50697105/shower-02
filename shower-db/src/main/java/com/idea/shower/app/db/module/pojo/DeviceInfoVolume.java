package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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

    public static DeviceInfoVolumeBuilder builder() {
        return new DeviceInfoVolumeBuilder();
    }
}