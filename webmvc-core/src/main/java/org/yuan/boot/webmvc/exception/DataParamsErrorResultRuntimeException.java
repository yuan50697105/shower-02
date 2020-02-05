package org.yuan.boot.webmvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.pojo.Result;
import org.yuan.boot.webmvc.utils.Results;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 12:09
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DataParamsErrorResultRuntimeException extends ResultRuntimeException {
    public DataParamsErrorResultRuntimeException() {
        super(Results.dataParamsError());
    }

    public DataParamsErrorResultRuntimeException(String message) {
        super(Results.dataParamsError(message));
    }

    public DataParamsErrorResultRuntimeException(int code, String message, Object data) {
        super(code, message, data);
    }

    public DataParamsErrorResultRuntimeException(int code, String message) {
        super(code, message);
    }

    public DataParamsErrorResultRuntimeException(Result result) {
        super(result);
    }
}