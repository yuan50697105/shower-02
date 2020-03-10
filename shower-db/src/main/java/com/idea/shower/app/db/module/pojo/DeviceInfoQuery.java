package com.idea.shower.app.db.module.pojo;

import com.idea.shower.db.mybaits.pojo.BaseDbQuery;
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
    private Long id;
    private String code;
    private Integer enabled;
}