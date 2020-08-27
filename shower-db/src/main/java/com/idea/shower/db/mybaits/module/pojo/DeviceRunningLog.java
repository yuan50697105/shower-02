package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.io.Serializable;

/**
 * device_running_log
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceRunningLog extends BaseDbEntity implements Serializable {
    /**
     * deviceId
     */
    private Long deviceId;

    /**
     * deviceCode
     */
    private String deviceCode;

    /**
     * status
     */
    private Integer status;

    /**
     * personStatus
     */
    private Integer personStatus;

    /**
     * personSpeed
     */
    private Double personSpeed;

    /**
     * temperature01
     */
    private Double temperature01;

    /**
     * temperature02
     */
    private Double temperature02;

    /**
     * volume01
     */
    private Double volume01;

    /**
     * volume02
     */
    private Double volume02;

    private static final long serialVersionUID = 1L;
}