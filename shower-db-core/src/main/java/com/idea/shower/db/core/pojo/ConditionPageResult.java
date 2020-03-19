package com.idea.shower.db.core.pojo;

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
public class ConditionPageResult<T, E> extends BaseDbCorePageResult<T> {
    private E query;

    public ConditionPageResult(BaseDbCorePageResult<T> pageResult, E query) {
        super(pageResult.getPage(), pageResult.getSize(), pageResult.getData(), pageResult.getTotalRows(), pageResult.getTotalPages());
        this.query = query;
    }
}