package com.idea.shower.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.commons.pojo.BaseQueryBase;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 12:58
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminUserQueryBase extends BaseQueryBase {
    private Long id;
    private String name;

    public AdminUserQueryBase() {
    }

    public AdminUserQueryBase(int page, int size) {
        super(page, size);
    }

    public AdminUserQueryBase(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}