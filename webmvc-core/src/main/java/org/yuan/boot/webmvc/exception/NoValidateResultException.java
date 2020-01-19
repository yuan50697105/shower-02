package org.yuan.boot.webmvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.pojo.Result;
import org.yuan.boot.webmvc.utils.Results;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class NoValidateResultException extends ResultException {
    public NoValidateResultException() {
        super(Results.dataParamsError());
    }

    public NoValidateResultException(Result result) {
        super(result);
    }

    public NoValidateResultException(String message) {
        super(Results.dataParamsError(message));
    }
}