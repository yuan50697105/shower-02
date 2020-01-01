package org.yuan.boot.webmvc.hateoas.exception;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.hateoas.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResultException extends Exception {
    private Result result;

    public ResultException() {
    }

    public ResultException(Result result) {
        this.result = result;
    }
}