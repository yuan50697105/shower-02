package com.idea.shower.db.mybaits.module.pojo.query;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeviceOrderInfoQuery extends BaseDbQuery {
    private String orderId;
    private String orderNo;
    private Long deviceId;
    private String deviceCode;
}