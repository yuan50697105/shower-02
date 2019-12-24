package org.yuan.boot.webmvc.pojo;

import cn.hutool.http.HttpStatus;
import lombok.Data;

@Data
public class Result {
    public static final String OK_MESSAGE = "操作成功";
    public static final String ERROR_MESSAGE = "操作失败";
    private int code;
    private String message;

    public Result() {
        this.code = HttpStatus.HTTP_OK;
        this.message = OK_MESSAGE;
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result ok() {
        return new Result(HttpStatus.HTTP_OK, OK_MESSAGE);
    }

    public Result error(int code) {
        return new Result(code, ERROR_MESSAGE);
    }
}
