package com.idea.shower.shower.commons.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.commons.utils.Results;
import com.idea.shower.webmvc.exception.ResultException;
import com.idea.shower.webmvc.pojo.Result;

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
        super(Results.existError(message));
    }
}