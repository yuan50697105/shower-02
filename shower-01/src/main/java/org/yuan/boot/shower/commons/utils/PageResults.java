package org.yuan.boot.shower.commons.utils;

import com.github.pagehelper.PageInfo;
import org.yuan.boot.db.pojo.PageResult;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 22:53
 */
public class PageResults {
    public static <T> PageResult<T> of(PageInfo<T> pageInfo) {
        return new PageResult<>(pageInfo);
    }
}