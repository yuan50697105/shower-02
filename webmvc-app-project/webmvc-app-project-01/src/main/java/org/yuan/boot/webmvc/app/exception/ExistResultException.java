package org.yuan.boot.webmvc.app.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.exception.ResultException;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 00:09
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ExistResultException extends ResultException {
    public ExistResultException(Result result) {
        super(result);
    }
}