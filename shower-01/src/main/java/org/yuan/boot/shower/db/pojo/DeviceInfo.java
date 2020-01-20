package org.yuan.boot.shower.db.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

import java.io.Serializable;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 16:53
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class DeviceInfo extends BaseEntity<DeviceInfo> implements Serializable {
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

    public DeviceInfo() {
    }

    @Builder
    public DeviceInfo(Long id, String code, String address, String point) {
        super(id);
        this.code = code;
        this.address = address;
        this.point = point;
    }
}