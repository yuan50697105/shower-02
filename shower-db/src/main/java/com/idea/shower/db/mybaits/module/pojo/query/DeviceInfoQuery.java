package com.idea.shower.db.mybaits.module.pojo.query;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:44
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeviceInfoQuery extends BaseDbQuery {
    private String code;
    private Integer enabled;
    private Long areaId;
    private Integer page = 1;
    private Integer limit = 8;
}