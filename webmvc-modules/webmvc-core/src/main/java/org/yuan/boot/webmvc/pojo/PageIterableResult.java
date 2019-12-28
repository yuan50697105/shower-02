package org.yuan.boot.webmvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageIterableResult<T> extends IterableResult<T> {
    private long page;
    private long size;
    private long totalNumberOfRows;
    private long totalPages;

    public PageIterableResult(Integer code, String message) {
        super(code, message);
    }

    public PageIterableResult(Integer code, String message, Iterable<T> data, long page, long size, long totalNumberOfRows, long totalPages) {
        super(code, message, data);
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }

    public PageIterableResult(Iterable<T> data, long page, long size, long totalNumberOfRows, long totalPages) {
        super(data);
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }
}
