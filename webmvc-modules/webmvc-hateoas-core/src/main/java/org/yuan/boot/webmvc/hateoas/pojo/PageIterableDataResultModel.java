package org.yuan.boot.webmvc.hateoas.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.Link;
import org.yuan.boot.webmvc.pojo.PageIterableResult;

import java.util.List;

/**
 * @param <T>
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageIterableDataResultModel<T> extends IterateDataResultModel<T> {
    private long page;
    private long size;
    private long totalNumberOfRows;
    private long totalPages;

    public PageIterableDataResultModel(Iterable<T> data, long page, long size, long totalNumberOfRows, long totalPages) {
        super(data);
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }

    public PageIterableDataResultModel(Iterable<T> data, long page, long size, long totalNumberOfRows, long totalPages, Link initialLink) {
        super(data, initialLink);
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }

    public PageIterableDataResultModel(Iterable<T> data, long page, long size, long totalNumberOfRows, long totalPages, List<Link> initialLinks) {
        super(data, initialLinks);
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }

    public PageIterableDataResultModel(int code, String message, Iterable<T> data, long page, long size, long totalNumberOfRows, long totalPages) {
        super(code, message, data);
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }

    public PageIterableDataResultModel(int code, String message, Iterable<T> data, Link initialLink, long page, long size, long totalNumberOfRows, long totalPages) {
        super(code, message, data, initialLink);
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }

    public PageIterableDataResultModel(int code, String message, Iterable<T> data, List<Link> initialLinks, long page, long size, long totalNumberOfRows, long totalPages) {
        super(code, message, data, initialLinks);
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }

    public PageIterableDataResultModel(PageIterableResult<T> result) {
        super(result);
        this.page = result.getPage();
        this.size = result.getSize();
        this.totalNumberOfRows = result.getTotalNumberOfRows();
        this.totalPages = result.getTotalPages();
    }

    public PageIterableDataResultModel(PageIterableResult<T> result, Link initialLink) {
        super(result, initialLink);
        this.page = result.getPage();
        this.size = result.getSize();
        this.totalNumberOfRows = result.getTotalNumberOfRows();
        this.totalPages = result.getTotalPages();
    }

    public PageIterableDataResultModel(PageIterableResult<T> result, List<Link> initialLinks) {
        super(result, initialLinks);
        this.page = result.getPage();
        this.size = result.getSize();
        this.totalNumberOfRows = result.getTotalNumberOfRows();
        this.totalPages = result.getTotalPages();
    }
}
