package org.yuan.boot.webmvc.pojo;

import cn.hutool.http.HttpStatus;
import lombok.Data;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:49
 */
@Data
public class Result {
    public static final String OK_MESSAGE = "操作成功";
    private int code;
    private String message;
    private Object data;

    public Result() {
        this.code = HttpStatus.HTTP_OK;
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

    public static Result data(int code, String message, Object data) {
        return new Result(code, message, data);
    }

    public static Result error(int code, String message) {
        return new Result(code, message);
    }
}