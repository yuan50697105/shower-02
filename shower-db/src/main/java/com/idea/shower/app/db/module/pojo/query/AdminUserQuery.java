package com.idea.shower.app.db.module.pojo.query;

import com.idea.shower.app.db.commons.pojo.BaseDbQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 15:45
 */
@EqualsAndHashCode(callSuper = true)
@Data

@NoArgsConstructor
public class AdminUserQuery extends BaseDbQuery {
    private String username;
    private String name;
    private Integer enabled;
}