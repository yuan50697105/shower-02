package com.idea.shower.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.commons.pojo.BaseQueryBase;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:21
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeviceRecordQueryBase extends BaseQueryBase {
    private Long deviceId;
    private String deviceCode;
    private Integer type;

    public DeviceRecordQueryBase() {
    }

    public DeviceRecordQueryBase(int page, int size) {
        super(page, size);
    }

    public DeviceRecordQueryBase(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}