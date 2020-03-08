package com.idea.shower.shower.app.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.app.commons.pojo.BaseConditionQuery;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 12:58
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminUserQueryBaseConditionQuery extends BaseConditionQuery {
    private Long id;
    private String name;

    public AdminUserQueryBaseConditionQuery() {
    }

    public AdminUserQueryBaseConditionQuery(int page, int size) {
        super(page, size);
    }

    public AdminUserQueryBaseConditionQuery(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}