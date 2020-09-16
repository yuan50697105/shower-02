package com.idea.shower.db.mybaits.commons.pojo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 14:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public final class PageResult<T> {
    private long page;
    private long size;
    private Iterable<T> list;
    private long totalPages;
    private long totalRows;

    public PageResult(PageInfo<T> pageInfo) {
        this(pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getList(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResult(IPage<T> iPage) {
        this(iPage.getCurrent(), iPage.getSize(), iPage.getRecords(), iPage.getPages(), iPage.getTotal());
    }

    public static <T> PageResult<T> of(PageInfo<T> pageInfo) {
        return new PageResult<>(pageInfo);
    }


}