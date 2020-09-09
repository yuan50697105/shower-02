package com.idea.shower.db.mybaits.module.pojo.query;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:21
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeviceRecordQuery extends BaseDbQuery {
    private Long deviceId;
    private String deviceCode;
    private Integer type;

}