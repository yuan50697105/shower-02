package org.yuan.boot.webmvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class IterableResult<E extends Iterable<?>> extends DataResult<E> {


    public IterableResult(Integer code, String message) {
        super(code, message);
    }

    public IterableResult(Integer code, String message, E data) {
        super(code, message, data);
    }


    public IterableResult(E data) {
        super(data);
    }
}
