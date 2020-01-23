package org.yuan.boot.shower.wx.exception.handler;

import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 19:02
 */
@RestControllerAdvice
@ControllerAdvice
public class WxExceptionHandler {
    @ExceptionHandler(WxErrorException.class)
    public Result hanlder(WxErrorException e) {
        return Results.wxError(e.getMessage());
    }
}