package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceInfo extends BaseEntity implements Serializable {
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

    /**
     * 设备类型
     */
    private Integer type;

    private static final long serialVersionUID = 1L;
}