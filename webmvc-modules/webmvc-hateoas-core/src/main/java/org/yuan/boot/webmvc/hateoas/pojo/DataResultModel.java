package org.yuan.boot.webmvc.hateoas.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.Link;
import org.yuan.boot.webmvc.pojo.DataResult;

import java.util.List;

/**
 * @param <T>
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DataResultModel<T> extends ResultModel {
    private T data;

    public DataResultModel(T data) {
        super();
        this.data = data;
    }

    public DataResultModel(T data, Link initialLink) {
        super(initialLink);
        this.data = data;
    }

    public DataResultModel(T data, List<Link> initialLinks) {
        super(initialLinks);
        this.data = data;
    }

    public DataResultModel(int code, String message, T data) {
        super(code, message);
        this.data = data;
    }

    public DataResultModel(int code, String message, T data, Link initialLink) {
        super(code, message, initialLink);
        this.data = data;
    }

    public DataResultModel(int code, String message, T data, List<Link> initialLinks) {
        super(code, message, initialLinks);
        this.data = data;
    }

    public DataResultModel(DataResult<T> result) {
        super(result);
        this.data = result.getData();
    }

    public DataResultModel(DataResult<T> result, Link initialLink) {
        super(result, initialLink);
        this.data = result.getData();
    }

    public DataResultModel(DataResult<T> result, List<Link> initialLinks) {
        super(result, initialLinks);
        this.data = result.getData();
    }
}
