package com.idea.shower.db.mybaits.pojo;

import com.idea.shower.db.core.pojo.BaseCoreQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 14:30
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class BaseQueryBase extends BaseCoreQuery {
    public BaseQueryBase() {
    }

    public BaseQueryBase(int page, int size) {
        super(page, size);
    }

    public BaseQueryBase(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}