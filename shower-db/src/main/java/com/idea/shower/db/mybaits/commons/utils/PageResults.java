package com.idea.shower.db.mybaits.commons.utils;

import com.github.pagehelper.PageInfo;
import com.idea.shower.db.mybaits.commons.pojo.PageResult;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-22 08:34
 */
public class PageResults {
    public static <T> PageResult<T> of(PageInfo<T> pageInfo) {
        return new PageResult<>(pageInfo);
    }
}