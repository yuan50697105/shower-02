package com.idea.shower.web.webmvc.exception.handler;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.idea.shower.web.webmvc.exception.ResultException;
import com.idea.shower.web.webmvc.exception.ResultRuntimeException;
import com.idea.shower.web.webmvc.pojo.Result;
import com.idea.shower.web.webmvc.utils.ResultUtils;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuanez
 * @create: 2020-01-13 13:52
 **/
@RestControllerAdvice
@ControllerAdvice
@Log4j2
public class GlobalExceptionHandler {
    @ExceptionHandler(ResultException.class)
    public Result resultExceptionHandler(ResultException e) {
        return e.getResult();
    }

    @ExceptionHandler(ResultRuntimeException.class)
    public Result resultRuntimeExceptionHandler(ResultRuntimeException e) {
        return e.getResult();
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public Result illegalArgumentExceptionHandler(IllegalArgumentException e) {
        log.error(e.getMessage(), e.getCause());
        return ResultUtils.dataParamsError();
    }

    @ExceptionHandler(Exception.class)
    public Result exceptionHandler(Exception e) {
        log.error(e.getLocalizedMessage(), e.getCause());
        return ResultUtils.systemError();
    }
}
