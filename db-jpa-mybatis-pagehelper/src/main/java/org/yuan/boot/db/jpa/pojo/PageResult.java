package org.yuan.boot.db.jpa.pojo;


import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.Page;
import org.yuan.boot.db.pojo.AbstractCorePageResult;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 14:30
 */
@EqualsAndHashCode(callSuper = true)
@Data
public final class PageResult<T> extends AbstractCorePageResult<T> {

    public PageResult(Page<T> page) {
        super(page.getPageable().getPageNumber() + 1, page.getPageable().getPageSize(), page.getContent(), page.getTotalElements(), page.getTotalPages());
    }

    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getList(), pageInfo.getTotal(), pageInfo.getPages());
    }


    public PageResult(long page, long size, List<T> data, long totalNumberOfRows, long totalPages) {
        super(page, size, data, totalNumberOfRows, totalPages);
    }
}