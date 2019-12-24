package org.yuan.boot.webmvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DataResult<T> extends Result {
    private T data;

    public DataResult(T data) {
        this.data = data;
    }

    public DataResult(int code, String message, T data) {
        super(code, message);
        this.data = data;
    }
}
