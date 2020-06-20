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