package org.yuan.boot.webmvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DataResult<T> extends Result {
    private T data;


    public DataResult(Integer code, String message, T data) {
        super(code, message);
        this.data = data;
    }

    public DataResult(Integer code, String message) {
        super(code, message);
    }

    public DataResult(T data) {
        super();
        this.data = data;
    }
}
