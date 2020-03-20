package com.idea.shower.app.commons.db.module.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.app.commons.pojo.BaseConditionQuery;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:22
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminRoleQuery extends BaseConditionQuery {
    private Long id;
    private String name;


}