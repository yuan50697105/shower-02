package com.idea.shower.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.commons.pojo.BaseCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:22
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminRoleCondition extends BaseCondition {
    private Long id;
    private String name;

    public AdminRoleCondition() {
    }

    public AdminRoleCondition(int page, int size) {
        super(page, size);
    }

    public AdminRoleCondition(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}