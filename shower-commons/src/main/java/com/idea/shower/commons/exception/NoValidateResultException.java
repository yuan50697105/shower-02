package com.idea.shower.commons.exception;

import com.idea.shower.commons.pojo.Result;
import com.idea.shower.commons.utils.ResultUtils;
import lombok.EqualsAndHashCode;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:52
 */
@EqualsAndHashCode(callSuper = true)
public class NoValidateResultException extends ResultException {
    public NoValidateResultException() {
        super(ResultUtils.dataParamsError());
    }

    public NoValidateResultException(Result result) {
        super(result);
    }

    public NoValidateResultException(String message) {
        super(ResultUtils.dataParamsError(message));
    }
}