package org.yuan.boot.db.pojo;

import lombok.Data;

import java.util.List;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuane
 * @create: 2019-12-29 13:53
 */
@Data
public abstract class AbstractCorePageResult<T> {
    private long page;
    private long size;
    private List<T> data;
    private long totalNumberOfRows;
    private long totalPages;

    public AbstractCorePageResult(long page, long size, List<T> data, long totalNumberOfRows, long totalPages) {
        this.page = page;
        this.size = size;
        this.data = data;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }
}