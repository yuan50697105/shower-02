package com.idea.shower.app.commons.exception;

import com.idea.shower.app.commons.utils.ResultsUtils;
import com.idea.shower.web.webmvc.exception.ResultRuntimeException;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-12 16:47
 */
public class CustomerInfoNotExistResultRuntimeException extends ResultRuntimeException {
    public CustomerInfoNotExistResultRuntimeException() {
        super(ResultsUtils.customerInfoNotExistError());
    }
}