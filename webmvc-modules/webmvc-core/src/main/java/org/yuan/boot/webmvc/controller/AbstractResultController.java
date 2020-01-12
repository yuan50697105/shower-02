package org.yuan.boot.webmvc.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yuan.boot.webmvc.exception.NoValidateResultException;
import org.yuan.boot.webmvc.exception.NoValidateResultRuntimeException;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.StringJoiner;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:51
 */
@RestControllerAdvice
@Log4j2
public abstract class AbstractResultController {

    public final static String HTTP_METHOD_POST = "POST";
    public final static String HTTP_METHOD_GET = "GET";
    public final static String HTTP_METHOD_DELETE = "DELETE";
    public final static String HTTP_METHOD_PUT = "PUT";

    @ExceptionHandler(NoValidateResultException.class)
    public Result noValidateResultException(NoValidateResultException e) {
        return e.getResult();
    }

    @ExceptionHandler(NoValidateResultRuntimeException.class)
    public Result noValidateResultRuntimeException(NoValidateResultRuntimeException e) {
        return e.getResult();
    }

    @ExceptionHandler(Exception.class)
    public Result exceptionHandler(Exception e) {
        e.printStackTrace();
        log.error(e.getLocalizedMessage(), e.getCause());
        return Result.systemError();
    }

    public void validate(BindingResult result) {
        if (result.hasErrors()) {
            StringJoiner joiner = new StringJoiner(",");
            for (FieldError fieldError : result.getFieldErrors()) {
                joiner.add(fieldError.getDefaultMessage());
            }
            throw new NoValidateResultRuntimeException(Result.paramsError(joiner.toString()));
        }
    }
}