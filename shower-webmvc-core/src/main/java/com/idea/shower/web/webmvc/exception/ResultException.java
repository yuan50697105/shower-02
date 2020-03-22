package com.idea.shower.web.webmvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.web.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResultException extends Exception {
    private Result result;

    public ResultException(int code, String message) {
        this(Result.builder().code(code).message(message).build());
    }

    public ResultException(int code, String message, Object data) {
        this(Result.builder().code(code).message(message).data(data).build());
    }

    public ResultException(Result result) {
        this.result = result;
    }
}