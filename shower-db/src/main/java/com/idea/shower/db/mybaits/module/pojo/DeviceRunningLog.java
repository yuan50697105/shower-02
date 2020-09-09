package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 设备运行日志
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceRunningLog extends BaseDbEntity {
    /**
     * 设备ID
     */
    private Long deviceId;

    /**
     * 设备编号
     */
    private String deviceCode;

    /**
     * 运行状态
     */
    private Integer status;

    /**
     * 人员状态
     */
    private Integer personStatus;

    /**
     * 人员消费
     */
    private Double personSpeed;

    /**
     * 温度01
     */
    private Double temperature01;

    /**
     * 温度02
     */
    private Double temperature02;

    /**
     * 水箱容量01
     */
    private Double volume01;

    /**
     * 水箱容量02
     */
    private Double volume02;
}