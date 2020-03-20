package com.idea.shower.web.webmvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.web.webmvc.pojo.Result;
import com.idea.shower.web.webmvc.utils.ResultUtils;

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