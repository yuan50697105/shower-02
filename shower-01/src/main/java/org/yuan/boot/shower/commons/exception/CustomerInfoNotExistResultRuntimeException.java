package org.yuan.boot.shower.commons.exception;

import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.webmvc.exception.ResultRuntimeException;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-12 16:47
 */
public class CustomerInfoNotExistResultRuntimeException extends ResultRuntimeException {
    public CustomerInfoNotExistResultRuntimeException() {
        super(Results.customerInfoNotExistError());
    }
}