package com.idea.shower.web.webmvc.exception;

import cn.hutool.core.util.ObjectUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.web.webmvc.pojo.Result;
import com.idea.shower.web.webmvc.utils.ResultsUtils;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:53
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class NoValidateResultRuntimeException extends ResultRuntimeException {
    public NoValidateResultRuntimeException() {
        super(ResultsUtils.dataParamsError());
    }

    public NoValidateResultRuntimeException(Result result) {
        super(result);
    }

    public NoValidateResultRuntimeException(String message) {
        super(ResultsUtils.dataParamsError(ObjectUtil.isNotEmpty(message) ? message : ResultsUtils.ResultConstants.DATA_PARAMS_ERROR_MESSAGE));
    }
}