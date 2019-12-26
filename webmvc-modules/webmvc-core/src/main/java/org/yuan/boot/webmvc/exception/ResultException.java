package org.yuan.boot.webmvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.pojo.Result;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResultException extends Exception {
    private Result result;

    public ResultException(Result result) {
        this.result = result;
    }
}
