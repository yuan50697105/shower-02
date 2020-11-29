package com.idea.shower.commons.exception;

import cn.hutool.core.util.ObjectUtil;
import com.idea.shower.commons.pojo.Result;
import com.idea.shower.commons.utils.ResultUtils;
import lombok.EqualsAndHashCode;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:53
 */
@EqualsAndHashCode(callSuper = true)
public class NoValidateResultRuntimeException extends ResultRuntimeException {
    public NoValidateResultRuntimeException() {
        super(ResultUtils.dataParamsError());
    }

    public NoValidateResultRuntimeException(Result result) {
        super(result);
    }

    public NoValidateResultRuntimeException(String message) {
        super(ResultUtils.dataParamsError(ObjectUtil.isNotEmpty(message) ? message : ResultUtils.ResultConstants.DATA_PARAMS_ERROR_MESSAGE));
    }
}