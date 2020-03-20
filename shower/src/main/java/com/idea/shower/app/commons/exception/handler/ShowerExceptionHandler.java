package com.idea.shower.app.commons.exception.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.idea.shower.web.webmvc.exception.handler.GlobalExceptionHandler;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuanez
 * @create: 2020-01-13 14:15
 **/
@RestControllerAdvice
@ControllerAdvice
public class ShowerExceptionHandler extends GlobalExceptionHandler {
}
