package com.idea.shower.shower.app.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.app.commons.pojo.BaseQueryBase;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeviceOrderInfoQueryBase extends BaseQueryBase {
    private Long id;
    private String orderId;
    private String orderNo;
    private Long deviceId;
    private String deviceCode;

    public DeviceOrderInfoQueryBase() {
    }

    public DeviceOrderInfoQueryBase(int page, int size) {
        super(page, size);
    }

    public DeviceOrderInfoQueryBase(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}