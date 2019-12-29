package org.yuan.boot.webmvc.controller;

import cn.hutool.http.HttpStatus;
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
public class ResultController {

    @ExceptionHandler(NoValidateResultException.class)
    public Result noValidateResultException(NoValidateResultException e) {
        return e.getResult();
    }

    @ExceptionHandler(NoValidateResultRuntimeException.class)
    public Result noValidateResultRuntimeException(NoValidateResultRuntimeException e) {
        return e.getResult();
    }

    public void validate(BindingResult result) {
        if (result.hasErrors()) {
            StringJoiner joiner = new StringJoiner(",");
            for (FieldError fieldError : result.getFieldErrors()) {
                joiner.add(fieldError.getDefaultMessage());
            }
            throw new NoValidateResultRuntimeException(Result.error(HttpStatus.HTTP_NOT_ACCEPTABLE, joiner.toString()));
        }
    }
}