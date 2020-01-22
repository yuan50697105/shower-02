package org.yuan.boot.webmvc.exception;

import cn.hutool.core.util.ObjectUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.pojo.Result;
import org.yuan.boot.webmvc.utils.Results;

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
        super(Results.dataParamsError());
    }

    public NoValidateResultRuntimeException(Result result) {
        super(result);
    }

    public NoValidateResultRuntimeException(String message) {
        super(Results.dataParamsError(ObjectUtil.isNotEmpty(message) ? message : Results.Resulconstants.DATA_PARAMS_ERROR_MESSAGE));
    }
}