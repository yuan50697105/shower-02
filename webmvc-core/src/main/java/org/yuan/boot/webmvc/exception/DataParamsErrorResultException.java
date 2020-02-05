package org.yuan.boot.webmvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.pojo.Result;
import org.yuan.boot.webmvc.utils.Results;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 12:10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DataParamsErrorResultException extends ResultException {
    public DataParamsErrorResultException() {
        super(Results.dataParamsError());
    }

    public DataParamsErrorResultException(String message) {
        super(Results.dataParamsError(message));
    }

    public DataParamsErrorResultException(int code, String message) {
        super(code, message);
    }

    public DataParamsErrorResultException(int code, String message, Object data) {
        super(code, message, data);
    }

    public DataParamsErrorResultException(Result result) {
        super(result);
    }
}