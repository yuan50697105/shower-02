package com.idea.shower.app.commons.db.module.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.app.commons.pojo.BaseConditionQuery;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeviceOrderInfoQueryBaseConditionQuery extends BaseConditionQuery {
    private Long id;
    private String orderId;
    private String orderNo;
    private Long deviceId;
    private String deviceCode;

    public DeviceOrderInfoQueryBaseConditionQuery() {
    }

    public DeviceOrderInfoQueryBaseConditionQuery(int page, int size) {
        super(page, size);
    }

    public DeviceOrderInfoQueryBaseConditionQuery(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}