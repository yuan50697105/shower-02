package org.yuan.boot.webmvc.app.exception.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yuan.boot.webmvc.exception.handler.GlobalExceptionHandler;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuanez
 * @create: 2020-01-13 14:15
 **/
@RestControllerAdvice
@ControllerAdvice
public class AppExceptionHandler extends GlobalExceptionHandler {
}
