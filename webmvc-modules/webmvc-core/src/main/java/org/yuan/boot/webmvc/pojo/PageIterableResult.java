package org.yuan.boot.webmvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageIterableResult<T> extends IterableResult<T> {
    private long page;
    private long size;
    private long theTotalNumberOfRecords;
    private long totalPages;

    public PageIterableResult(int code, String message, Iterable<T> data, long page, long size, long theTotalNumberOfRecords, long totalPages) {
        super(code, message, data);
        this.page = page;
        this.size = size;
        this.theTotalNumberOfRecords = theTotalNumberOfRecords;
        this.totalPages = totalPages;
    }

    public PageIterableResult(Iterable<T> data, long page, long size, long theTotalNumberOfRecords, long totalPages) {
        super(data);
        this.page = page;
        this.size = size;
        this.theTotalNumberOfRecords = theTotalNumberOfRecords;
        this.totalPages = totalPages;
    }
}
