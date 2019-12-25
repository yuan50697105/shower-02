package org.yuan.boot.webmvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageCollectionResult<T> extends IterableResult<List<T>> {
    private long page;
    private long size;
    private long totalNumberOfRows;
    private long totalPages;

    public PageCollectionResult(Integer code, String message) {
        super(code, message);
    }

    public PageCollectionResult(Integer code, String message, List<T> data, long page, long size, long totalNumberOfRows, long totalPages) {
        super(code, message, data);
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }

    public PageCollectionResult(List<T> data, long page, long size, long totalNumberOfRows, long totalPages) {
        super(data);
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }
}
