package com.idea.shower.app.commons.db.module.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.app.commons.pojo.BaseConditionQuery;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:44
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeviceInfoQueryBaseConditionQuery extends BaseConditionQuery {
    private Long id;
    private String code;
    private Integer enabled;

    public DeviceInfoQueryBaseConditionQuery() {
    }

    public DeviceInfoQueryBaseConditionQuery(int page, int size) {
        super(page, size);
    }

    public DeviceInfoQueryBaseConditionQuery(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}