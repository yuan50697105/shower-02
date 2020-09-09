package com.idea.shower.db.mybaits.core.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-08 14:06
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ConditionPageResult<T, E> extends IPageResult<T> {
    private E query;

    public ConditionPageResult(IPageResult<T> pageResult, E query) {
        super(pageResult.getPage(), pageResult.getSize(), pageResult.getList(), pageResult.getTotalRows(), pageResult.getTotalPages());
        this.query = query;
    }
}