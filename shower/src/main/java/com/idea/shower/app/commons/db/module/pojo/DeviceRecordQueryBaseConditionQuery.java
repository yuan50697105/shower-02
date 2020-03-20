package com.idea.shower.app.commons.db.module.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.app.commons.pojo.BaseConditionQuery;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:21
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeviceRecordQueryBaseConditionQuery extends BaseConditionQuery {
    private Long deviceId;
    private String deviceCode;
    private Integer type;

    public DeviceRecordQueryBaseConditionQuery() {
    }

    public DeviceRecordQueryBaseConditionQuery(int page, int size) {
        super(page, size);
    }

    public DeviceRecordQueryBaseConditionQuery(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}