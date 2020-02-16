package com.idea.shower.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.commons.pojo.BaseCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:21
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeviceRecordCondition extends BaseCondition {
    private Long deviceId;
    private String deviceCode;
    private Integer type;

    public DeviceRecordCondition() {
    }

    public DeviceRecordCondition(int page, int size) {
        super(page, size);
    }

    public DeviceRecordCondition(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}