package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * device_record
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceRecord extends BaseDbEntity {
    private static final long serialVersionUID = 1L;
    /**
     * 设备ID
     */
    private Long deviceId;

    /**
     * 设备编号
     */
    private String deviceCode;

    /**
     * 操作类型
     */
    private Integer type;

    /**
     * 详情
     */
    private String content;

    public static DeviceRecordBuilder builder() {
        return new DeviceRecordBuilder();
    }
}