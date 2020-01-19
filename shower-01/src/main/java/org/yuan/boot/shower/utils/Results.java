package org.yuan.boot.shower.utils;

import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 00:06
 */
public class Results extends org.yuan.boot.webmvc.utils.Results {
    public final static Integer EXIST_ENTITY_ERROR = 20001;
    /**
     * 用户操作错误编码
     */
    public final static Integer USER_ERROR = 300000;
    public final static Integer CHANGE_PASSWORD_USER_NOT_HAD = 300001;
    public final static Integer CHANGE_PASSWORD_USER_OLD_PWD_ERROR = 300002;
    /**
     * 设备错误
     */
    public final static Integer DEVICE_ERROR = 400000;
    /**
     * 微信错误
     */
    public final static Integer WX_ERROR = 500000;


    public static Result existError(String message) {
        return Result.builder().code(EXIST_ENTITY_ERROR).message(message).build();
    }

}