package com.idea.shower.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.commons.pojo.BaseCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeviceOrderInfoCondition extends BaseCondition {
    private Long id;
    private String orderId;
    private String orderNo;
    private Long deviceId;
    private String deviceCode;

    public DeviceOrderInfoCondition() {
    }

    public DeviceOrderInfoCondition(int page, int size) {
        super(page, size);
    }

    public DeviceOrderInfoCondition(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}