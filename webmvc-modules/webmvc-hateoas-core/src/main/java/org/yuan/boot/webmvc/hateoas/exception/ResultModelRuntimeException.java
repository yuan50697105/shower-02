package org.yuan.boot.webmvc.hateoas.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.hateoas.pojo.ResultModel;
import org.yuan.boot.webmvc.pojo.Result;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResultModelRuntimeException extends RuntimeException {
    private ResultModel resultModel;

    public ResultModelRuntimeException(ResultModel resultModel) {
        this.resultModel = resultModel;
    }

    public ResultModelRuntimeException(Result result) {
        this(new ResultModel(result));
    }
}
