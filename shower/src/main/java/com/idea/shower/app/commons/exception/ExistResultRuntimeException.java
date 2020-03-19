package com.idea.shower.app.commons.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.app.commons.utils.ResultsUtils;
import com.idea.shower.web.webmvc.exception.ResultRuntimeException;
import com.idea.shower.web.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 00:10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ExistResultRuntimeException extends ResultRuntimeException {
    public ExistResultRuntimeException(Result result) {
        super(result);
    }

    public ExistResultRuntimeException(String message) {
        super(ResultsUtils.existError(message));
    }
}