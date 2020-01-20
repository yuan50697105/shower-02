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
    private Long id;
    private String code;
    private String address;
    private String point;

    public DeviceInfo() {
    }

    @Builder
    public DeviceInfo(Long id, Long id1, String code, String address, String point) {
        super(id);
        this.id = id1;
        this.code = code;
        this.address = address;
        this.point = point;
    }
}