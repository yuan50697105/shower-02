package com.idea.shower.shower.app.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.app.commons.pojo.BaseQueryBase;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:27
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerInfoQueryBase extends BaseQueryBase {
    private Long id;
    private String nickName;
    private String phone;

    public CustomerInfoQueryBase() {
    }

    public CustomerInfoQueryBase(int page, int size) {
        super(page, size);
    }

    public CustomerInfoQueryBase(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}