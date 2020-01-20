package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class DeviceInfo implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 编号
     */
    private String code;

    /**
     * 地址
     */
    private String address;

    /**
     * 坐标值
     */
    private String point;

    private static final long serialVersionUID = 1L;

    public static org.yuan.boot.shower.db.pojo.DeviceInfo.DeviceInfoBuilder builder() {
        return new org.yuan.boot.shower.db.pojo.DeviceInfo.DeviceInfoBuilder();
    }
}