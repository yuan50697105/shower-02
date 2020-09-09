package com.idea.shower.web.webmvc.exception;

import com.idea.shower.web.webmvc.pojo.Result;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResultRuntimeException extends RuntimeException {
    private Result result;

    public ResultRuntimeException(int code, String message, Object data) {
        this(Result.builder().code(code).message(message).data(data).build());
    }

    public ResultRuntimeException(int code, String message) {
        this(Result.builder().code(code).message(message).build());
    }


    public ResultRuntimeException(Result result) {
        this.result = result;
    }


}