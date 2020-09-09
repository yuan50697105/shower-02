package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

/**
 * 设备运行日志
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceRunningLog extends BaseDbEntity {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_DATE = "create_date";
    public static final String COL_UPDATE_DATE = "update_date";
    public static final String COL_CREATOR = "creator";
    public static final String COL_UPDATER = "updater";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_DEVICE_ID = "device_id";
    public static final String COL_DEVICE_CODE = "device_code";
    public static final String COL_STATUS = "status";
    public static final String COL_PERSON_STATUS = "person_status";
    public static final String COL_PERSON_SPEED = "person_speed";
    public static final String COL_TEMPERATURE01 = "temperature01";
    public static final String COL_TEMPERATURE02 = "temperature02";
    public static final String COL_VOLUME01 = "volume01";
    public static final String COL_VOLUME02 = "volume02";
    private static final long serialVersionUID = 1L;
    private String delFlag;

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