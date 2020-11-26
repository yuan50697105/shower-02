package com.idea.shower.commons.exception;

import com.idea.shower.commons.pojo.dto.Result;
import com.idea.shower.commons.utils.ResultUtils;
import lombok.EqualsAndHashCode;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 12:09
 */
@EqualsAndHashCode(callSuper = true)
public class DataParamsErrorResultRuntimeException extends ResultRuntimeException {
    public DataParamsErrorResultRuntimeException() {
        super(ResultUtils.dataParamsError());
    }

    public DataParamsErrorResultRuntimeException(String message) {
        super(ResultUtils.dataParamsError(message));
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