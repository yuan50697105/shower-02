package com.idea.shower.app.commons.utils;

import com.idea.shower.web.webmvc.pojo.Result;

import static com.idea.shower.app.commons.utils.ResultUtils.ResultConstants.*;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 00:06
 */
public class ResultUtils extends com.idea.shower.web.webmvc.utils.ResultUtils {
    public static Result existError(String message) {
        return Result.builder().code(EXIST_ENTITY_ERROR).message(message).build();
    }

    public static Result userError(String message) {
        return Result.builder().code(USER_ERROR).message(message).build();
    }

    public static Result deviceError(String message) {
        return Result.builder().code(DEVICE_ERROR).message(message).build();
    }

    public static Result deviceError(String message, Object data) {
        return Result.builder().code(DEVICE_ERROR).message(message).data(data).build();
    }

    public static Result wxError(String message) {
        return Result.builder().code(WX_ERROR).message(message).build();
    }

    public static Result wxError(String message, Object data) {
        return Result.builder().code(WX_ERROR).message(message).data(data).build();
    }

    public static Result customerInfoNotExistError() {
        return error(ResultConstants.CUSTOMER_INFO_NOT_EXIST_ERROR_CODE, ResultConstants.CUSTOMER_INFO_NOT_EXIST_ERROR_MESSAGE);
    }

    public static Result deviceInfoNotExistError() {
        return error(ResultConstants.DEVICE_INFO_NOT_EXIST_ERROR_CODE, ResultConstants.DEVICE_INFO_NOT_EXIST_ERROR_MESSAGE);
    }

    public static Result goodsInfoNotExistError() {
        return error(ResultConstants.GOODS_INFO_NOT_EXIST_ERROR_CODE, ResultConstants.GOODS_INFO_NOT_EXIST_ERROR_MESSAGE);
    }

    public static class ResultConstants extends com.idea.shower.web.webmvc.utils.ResultUtils.ResultConstants {
        public final static Integer EXIST_ENTITY_ERROR = 20001;
        /**
         * 用户操作错误编码
         */
        public final static Integer USER_ERROR = 300000;
        public final static Integer CHANGE_PASSWORD_USER_NOT_HAD = 300001;
        public final static Integer CHANGE_PASSWORD_USER_OLD_PWD_ERROR = 300002;
        public static final Integer CUSTOMER_INFO_NOT_EXIST_ERROR_CODE = 300003;
        public static final String CUSTOMER_INFO_NOT_EXIST_ERROR_MESSAGE = "用户不存在";
        /**
         * 设备错误
         */
        public final static Integer DEVICE_ERROR = 400000;
        public static final Integer DEVICE_INFO_NOT_EXIST_ERROR_CODE = 400001;
        public static final String DEVICE_INFO_NOT_EXIST_ERROR_MESSAGE = "设备不存在";

        /**
         * 微信错误
         */
        public final static Integer WX_ERROR = 500000;

        /**
         * 商品定价错误
         */
        public static final Integer GOODS_INFO_ERROR_CODE = 600000;
        public static final Integer GOODS_INFO_NOT_EXIST_ERROR_CODE = 600001;
        public static final String GOODS_INFO_NOT_EXIST_ERROR_MESSAGE = "定价不存在";
    }

}