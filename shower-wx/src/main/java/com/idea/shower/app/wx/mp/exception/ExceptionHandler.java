package com.idea.shower.app.wx.mp.exception;

import com.idea.shower.commons.pojo.dto.Result;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-05-17 10:46
 */
@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(WxErrorException.class)
    public Result result(WxErrorException e) {
        return ResultUtils.wxError(e.getMessage());
    }
}