package org.yuan.boot.webmvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class IterableResult<T> extends DataResult<Iterable<T>> {
    public IterableResult(Iterable<T> data) {
        super(data);
    }

    public IterableResult(int code, String message, Iterable<T> data) {
        super(code, message, data);
    }
}
