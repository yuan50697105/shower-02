package com.idea.shower.db.mybaits.module.pojo.query;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 10:51
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AreaInfoQuery extends BaseDbQuery {
    private String name;
    private String code;
}