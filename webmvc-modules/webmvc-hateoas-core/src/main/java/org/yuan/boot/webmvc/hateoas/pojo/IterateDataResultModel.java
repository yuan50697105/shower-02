package org.yuan.boot.webmvc.hateoas.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.Link;
import org.yuan.boot.webmvc.pojo.IterableResult;

import java.util.List;

/**
 * @param <T>
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class IterateDataResultModel<T> extends DataResultModel<Iterable<T>> {
    public IterateDataResultModel() {
    }

    public IterateDataResultModel(Iterable<T> data) {
        super(data);
    }

    public IterateDataResultModel(Iterable<T> data, Link initialLink) {
        super(data, initialLink);
    }

    public IterateDataResultModel(Iterable<T> data, List<Link> initialLinks) {
        super(data, initialLinks);
    }

    public IterateDataResultModel(int code, String message, Iterable<T> data) {
        super(code, message, data);
    }

    public IterateDataResultModel(int code, String message, Iterable<T> data, Link initialLink) {
        super(code, message, data, initialLink);
    }

    public IterateDataResultModel(int code, String message, Iterable<T> data, List<Link> initialLinks) {
        super(code, message, data, initialLinks);
    }

    public IterateDataResultModel(IterableResult<T> result) {
        super(result);
    }

    public IterateDataResultModel(IterableResult<T> result, Link initialLink) {
        super(result, initialLink);
    }

    public IterateDataResultModel(IterableResult<T> result, List<Link> initialLinks) {
        super(result, initialLinks);
    }
}
