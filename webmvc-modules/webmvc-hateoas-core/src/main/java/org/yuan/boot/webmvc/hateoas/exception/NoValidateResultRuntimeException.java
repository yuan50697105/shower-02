package org.yuan.boot.webmvc.hateoas.exception;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.hateoas.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:53
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class NoValidateResultRuntimeException extends ResultRuntimeException {
    public NoValidateResultRuntimeException() {
    }

    public NoValidateResultRuntimeException(Result result) {
        super(result);
    }
}