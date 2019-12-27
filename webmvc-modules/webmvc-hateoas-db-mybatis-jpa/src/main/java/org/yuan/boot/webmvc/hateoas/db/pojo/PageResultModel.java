package org.yuan.boot.webmvc.hateoas.db.pojo;


import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.Page;
import org.springframework.hateoas.Link;
import org.yuan.boot.webmvc.db.pojo.PageResult;
import org.yuan.boot.webmvc.hateoas.pojo.PageIterableDataResultModel;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: liu yan
 * @create: 2019-12-27 20:10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResultModel<T> extends PageIterableDataResultModel<T> {
    public PageResultModel(Page<T> page) {
        super(page.getContent(), page.getPageable().getPageNumber() + 1, page.getPageable().getPageSize(), page.getTotalElements(), page.getTotalPages());
    }

    public PageResultModel(PageInfo<T> pageInfo) {
        super(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResultModel(Page<T> page, Link link) {
        super(page.getContent(), page.getPageable().getPageNumber() + 1, page.getPageable().getPageSize(), page.getTotalElements(), page.getTotalPages(), link);
    }

    public PageResultModel(PageInfo<T> pageInfo, Link link) {
        super(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages(), link);
    }

    public PageResultModel(Page<T> page, List<Link> links) {
        super(page.getContent(), page.getPageable().getPageNumber() + 1, page.getPageable().getPageSize(), page.getTotalElements(), page.getTotalPages(), links);
    }

    public PageResultModel(PageInfo<T> pageInfo, List<Link> links) {
        super(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages(), links);
    }

    public PageResultModel(Integer code, String message, Page<T> page) {
        super(code, message, page.getContent(), page.getPageable().getPageNumber() + 1, page.getSize(), page.getTotalElements(), page.getTotalPages());
    }

    public PageResultModel(Integer code, String message, PageInfo<T> pageInfo) {
        super(code, message, pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResultModel(int code, String message, Page<T> page, Link initialLink) {
        super(code, message, page.getContent(), initialLink, page.getPageable().getPageNumber() + 1, page.getSize(), page.getTotalElements(), page.getTotalPages());
    }

    public PageResultModel(int code, String message, PageInfo<T> pageInfo, Link initialLink) {
        super(code, message, pageInfo.getList(), initialLink, pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResultModel(int code, String message, Page<T> page, List<Link> initialLinks) {
        super(code, message, page.getContent(), initialLinks, page.getPageable().getPageNumber() + 1, page.getSize(), page.getTotalElements(), page.getTotalPages());
    }

    public PageResultModel(int code, String message, PageInfo<T> pageInfo, List<Link> initialLinks) {
        super(code, message, pageInfo.getList(), initialLinks, pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResultModel(PageResult<T> result) {
        super(result);
    }

    public PageResultModel(PageResult<T> result, Link initialLink) {
        super(result, initialLink);
    }

    public PageResultModel(PageResult<T> result, List<Link> initialLinks) {
        super(result, initialLinks);
    }
}