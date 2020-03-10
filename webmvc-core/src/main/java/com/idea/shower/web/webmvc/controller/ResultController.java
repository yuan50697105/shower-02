package com.idea.shower.web.webmvc.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.idea.shower.web.webmvc.exception.NoValidateResultRuntimeException;

import java.util.StringJoiner;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:51
 */
@RestControllerAdvice
@Log4j2
public class ResultController {

    public final static String HTTP_METHOD_POST = "POST";
    public final static String HTTP_METHOD_GET = "GET";
    public final static String HTTP_METHOD_DELETE = "DELETE";
    public final static String HTTP_METHOD_PUT = "PUT";
    public final static String APPLICATION_JSON_UTF8 = "application/problem+json;charset=UTF-8";

    public void validate(BindingResult result) {
        if (result.hasErrors()) {
            StringJoiner joiner = new StringJoiner(",");
            for (FieldError fieldError : result.getFieldErrors()) {
                joiner.add(fieldError.getDefaultMessage());
            }
            throw new NoValidateResultRuntimeException(joiner.toString());
        }
    }
}