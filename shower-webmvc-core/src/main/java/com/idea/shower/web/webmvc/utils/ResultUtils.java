package com.idea.shower.web.webmvc.utils;

import com.idea.shower.db.core.pojo.BaseDbCorePageResult;
import com.idea.shower.db.core.pojo.ConditionPageResult;
import com.idea.shower.web.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-19 20:43
 */
public class ResultUtils {
    public static Result result(Integer code, String message, Object data) {
        return Result.builder().code(code).message(message).data(data).build();
    }

    public static Result result(Integer code, String message) {
        return Result.builder().code(code).message(message).build();
    }

    public static Result ok(String messge, Object data) {
        return result(ResultConstants.OK_CODE, messge, data);
    }

    public static Result ok(String message) {
        return ok(message, null);
    }

    public static Result ok() {
        return ok(ResultConstants.OK_MESSAGE, null);
    }

    public static Result data(Object data) {
        return ok(ResultConstants.OK_MESSAGE, data);
    }

    public static Result error(Integer code, String message, Object data) {
        return result(code, message, data);
    }

    public static Result error(Integer code, String message) {
        return error(code, message, null);
    }

    public static Result systemError(String message, Object data) {
        return error(ResultConstants.SYSTEM_ERROR, message, data);
    }

    public static Result systemError(String message) {
        return systemError(message, null);
    }

    public static Result systemError() {
        return systemError(ResultConstants.SYSTEM_ERROR_MESSAGE);
    }

    public static Result validateError(String message) {
        return result(ResultConstants.VALIDATE_ERROR, message, null);
    }

    public static Result dataParamsError(String message) {
        return error(ResultConstants.DATA_PARAMS_ERROR_CODE, message);
    }

    public static Result dataParamsError() {
        return error(ResultConstants.DATA_PARAMS_ERROR_CODE, ResultConstants.DATA_PARAMS_ERROR_MESSAGE);
    }

    public static Result otherError(String mesage, Object data) {
        return error(ResultConstants.OTHER_ERROR_CODE, mesage, data);
    }

    public static Result otherError(String message) {
        return error(ResultConstants.OTHER_ERROR_CODE, message);
    }

    public static Result userNotExistError() {
        return wxError(ResultConstants.WX_USER_NOT_EXIST_MSG);
    }

    public static Result wxOrderNotExistError() {
        return wxError(ResultConstants.WX_ORDER_NOT_EXIST_MSG);
    }

    public static Result goodsInfoNotExistError() {
        return goodsInfoError(ResultConstants.GOODS_INFO_NOT_EXIST_ERROR_MSG);
    }

    public static Result wxError(String message) {
        return error(ResultConstants.WX_ERROR_CODE, message);
    }

    public static Result goodsInfoError(String message) {
        return error(ResultConstants.GOODS_INFO_ERROR_CODE, message);
    }

    public static <T, E> Result data(BaseDbCorePageResult<T> pageResult, E condition) {
        return data(new ConditionPageResult(pageResult, condition));
    }

    public static class ResultConstants {
        public final static Integer OK_CODE = 200;
        public final static String OK_MESSAGE = "操作成功";
        public final static Integer SYSTEM_ERROR = 500;
        public final static String SYSTEM_ERROR_MESSAGE = "系统错误";
        public final static Integer VALIDATE_ERROR = 501;

        public static final Integer DATA_PARAMS_ERROR_CODE = 502;
        public static final String DATA_PARAMS_ERROR_MESSAGE = "参数错误";
        public static final Integer OTHER_ERROR_CODE = 503;
        public static final Integer WX_ERROR_CODE = 600;
        public static final String WX_USER_NOT_EXIST_MSG = "用户不存在";
        public static final String WX_ORDER_NOT_EXIST_MSG = "订单不存在";
        public static final Integer GOODS_INFO_ERROR_CODE = 700;
        public static final String GOODS_INFO_NOT_EXIST_ERROR_MSG = "价格信息不存在";

    }
}