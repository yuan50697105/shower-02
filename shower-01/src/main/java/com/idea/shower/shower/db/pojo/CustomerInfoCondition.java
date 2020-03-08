package com.idea.shower.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.commons.pojo.BaseCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:27
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerInfoCondition extends BaseCondition {
    private Long id;
    private String nickName;
    private String phone;

    public CustomerInfoCondition() {
    }

    public CustomerInfoCondition(int page, int size) {
        super(page, size);
    }

    public CustomerInfoCondition(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}