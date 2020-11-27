package com.idea.shower.commons.exception;

import com.idea.shower.commons.pojo.Result;
import com.idea.shower.commons.utils.ResultUtils;
import lombok.EqualsAndHashCode;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 12:10
 */
@EqualsAndHashCode(callSuper = true)
public class DataParamsErrorResultException extends ResultException {
    public DataParamsErrorResultException() {
        super(ResultUtils.dataParamsError());
    }

    public DataParamsErrorResultException(String message) {
        super(ResultUtils.dataParamsError(message));
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