package com.idea.shower.db.mybaits.pojo;

import com.github.pagehelper.PageInfo;
import com.idea.shower.db.core.pojo.IPageResult;
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
public final class PageResult<T> extends IPageResult<T> {
    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getList(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResult(long page, long size, Iterable<T> data, long totalNumberOfRows, long totalPages) {
        super(page, size, data, totalNumberOfRows, totalPages);
    }

    public static <T> PageResult<T> of(PageInfo<T> pageInfo) {
        return new PageResult<>(pageInfo);
    }


}