package com.idea.shower.db.mybaits.core.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuane
 * @create: 2019-12-29 13:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class IPageResult<T> {
    private long page;
    private long size;
    private Iterable<T> list;
    private long totalRows;
    private long totalPages;

}