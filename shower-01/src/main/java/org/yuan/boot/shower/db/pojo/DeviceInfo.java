package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceInfo extends BaseEntity implements Serializable {
    /**
     * 设备编号
     */
    private String code;

    /**
     * 设备类型 1 室外 2 室内
     */
    private Integer type;

    /**
     * 地址
     */
    private String address;

    /**
     * GPS
     */
    private String point;

    /**
     * 启用装填（1 启用 0 停用）
     */
    private Integer enabled;

    /**
     * 地区码
     */
    private String rangeCode;

    private static final long serialVersionUID = 1L;
}