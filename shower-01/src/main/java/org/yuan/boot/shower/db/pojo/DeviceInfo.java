package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceInfo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
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

}