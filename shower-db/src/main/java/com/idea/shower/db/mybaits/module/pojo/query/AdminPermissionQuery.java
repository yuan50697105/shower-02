package com.idea.shower.db.mybaits.module.pojo.query;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 15:44
 */
@EqualsAndHashCode(callSuper = true)
@Data

@NoArgsConstructor
public class AdminPermissionQuery extends BaseDbQuery {
    private String name;
}