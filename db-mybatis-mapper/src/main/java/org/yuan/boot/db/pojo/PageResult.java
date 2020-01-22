package org.yuan.boot.db.pojo;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 17:21
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends AbstractCorePageResult<T> {
    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getList(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResult(long page, long size, List<T> contents, long totalNumberOfRows, long totalPages) {
        super(page, size, contents, totalNumberOfRows, totalPages);
    }
}