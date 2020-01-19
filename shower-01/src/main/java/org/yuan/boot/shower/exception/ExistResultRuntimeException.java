package org.yuan.boot.shower.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.utils.Results;
import org.yuan.boot.webmvc.exception.ResultRuntimeException;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 00:10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ExistResultRuntimeException extends ResultRuntimeException {
    public ExistResultRuntimeException(Result result) {
        super(result);
    }

    public ExistResultRuntimeException(String message) {
        super(Results.existError(message));
    }
}