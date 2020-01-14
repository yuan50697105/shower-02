package org.yuan.boot.webmvc.app.utils;

import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 00:06
 */
public class ResultUtils {
    public static Result existError(String message) {
        return Result.error(ResultConstants.EXIST_ENTITY_ERROR, message);
    }
}