package com.idea.shower.shower.commons.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseQueryBase extends com.idea.shower.db.mybaits.pojo.BaseQueryBase {
    private Long id;
    private String createUser;
    private Date creatDateStart;
    private Date createDateEnd;

    public BaseQueryBase() {
    }

    public BaseQueryBase(int page, int size) {
        super(page, size);
    }

    public BaseQueryBase(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}