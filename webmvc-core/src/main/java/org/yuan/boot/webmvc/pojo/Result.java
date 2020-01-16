package org.yuan.boot.webmvc.pojo;

import cn.hutool.http.HttpStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.yuan.boot.db.pojo.AbstractCorePageResult;

import java.io.Serializable;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:49
 */
@Data
public class Result implements Serializable {
    public final static Integer OK_CODE = 200;
    public final static Integer SYSTEM_ERROR_CODE = 1000;
    public final static String SYSTEM_ERROR_MESSAGE = "系统错误";
    public final static Integer DATA_PARAMS_ERROR_CODE = 2000;
    public final static String DATA_PARAMS_ERROR_MESSAGE = "参数错误";
    public static final String OK_MESSAGE = "操作成功";
    private int code;
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;

    public Result() {
        this.code = OK_CODE;
        this.message = OK_MESSAGE;
    }

    public Result(Object data) {
        this.code = HttpStatus.HTTP_OK;
        this.message = OK_MESSAGE;
        this.data = data;
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result ok() {
        return new Result();
    }

    public static Result ok(String message) {
        return new Result(HttpStatus.HTTP_OK, message);
    }

    public static Result data(Object data) {
        return new Result(data);
    }

    public static <T> Result data(AbstractCorePageResult<T> pageResult) {
        return new Result(pageResult);
    }

    public static Result data(int code, String message, Object data) {
        return new Result(code, message, data);
    }

    public static Result error(int code, String message) {
        return new Result(code, message);
    }

    public static Result systemError() {
        return error(SYSTEM_ERROR_CODE, SYSTEM_ERROR_MESSAGE);
    }

    public static Result paramsError(String message) {
        return error(DATA_PARAMS_ERROR_CODE, message);
    }

    public static Result paramsError() {
        return paramsError(DATA_PARAMS_ERROR_MESSAGE);
    }
}