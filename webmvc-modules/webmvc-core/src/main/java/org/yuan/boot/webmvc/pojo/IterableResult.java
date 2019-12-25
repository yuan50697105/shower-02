package org.yuan.boot.webmvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class IterableResult<E> extends DataResult<Iterable<E>> {


    public IterableResult(Integer code, String message) {
        super(code, message);
    }

    public IterableResult(Integer code, String message, Iterable<E> data) {
        super(code, message, data);
    }


    public IterableResult(Iterable<E> data) {
        super(data);
    }
}
