package org.yuan.boot.webmvc.hateoas.controller;

import cn.hutool.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yuan.boot.webmvc.controller.ResultController;
import org.yuan.boot.webmvc.hateoas.exception.NoValidateResultModelException;
import org.yuan.boot.webmvc.hateoas.exception.NoValidateResultModelRuntimeException;
import org.yuan.boot.webmvc.hateoas.pojo.ResultModel;

import java.util.StringJoiner;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-27 23:33
 */
@RestControllerAdvice
public class ResultModelController extends ResultController {
    @ExceptionHandler(NoValidateResultModelException.class)
    public ResultModel noValidateResultModelExceptionHandler(NoValidateResultModelException e) {
        return e.getResultModel();
    }

    @ExceptionHandler(NoValidateResultModelRuntimeException.class)
    public ResultModel noValidateResultModelRuntimeExceptionHandler(NoValidateResultModelRuntimeException e) {
        return e.getResultModel();
    }

    public void validateInModel(BindingResult result) {
        if (result.hasErrors()) {
            StringJoiner joiner = new StringJoiner(",");
            for (FieldError fieldError : result.getFieldErrors()) {
                joiner.add(fieldError.getDefaultMessage());
            }
            throw new NoValidateResultModelRuntimeException(ResultModel.error(HttpStatus.HTTP_NOT_ACCEPTABLE, joiner.toString()));
        }
    }
}