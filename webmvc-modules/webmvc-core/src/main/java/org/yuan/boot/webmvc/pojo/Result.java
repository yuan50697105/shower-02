package org.yuan.boot.webmvc.pojo;

import cn.hutool.http.HttpStatus;
import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    public static final String OK_MESSAGE = "操作成功";
    public static final String ERROR_MESSAGE = "操作失败";
    private Integer code;
    private String message;

    public Result() {
        this.code = HttpStatus.HTTP_OK;
        this.message = OK_MESSAGE;
    }

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static Result ok() {
        return new Result(HttpStatus.HTTP_OK, OK_MESSAGE);
    }

    public static Result ok(String message) {
        return new Result(HttpStatus.HTTP_OK, message);
    }

    public static Result error(Integer code, String message) {
        return new Result(code, message);
    }
}
