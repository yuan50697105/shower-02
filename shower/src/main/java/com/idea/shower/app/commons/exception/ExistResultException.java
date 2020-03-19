package com.idea.shower.app.commons.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.app.commons.utils.ResultsUtils;
import com.idea.shower.web.webmvc.exception.ResultException;
import com.idea.shower.web.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 00:09
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ExistResultException extends ResultException {
    public ExistResultException(Result result) {
        super(result);
    }

    public ExistResultException(String message) {
        super(ResultsUtils.existError(message));
    }
}