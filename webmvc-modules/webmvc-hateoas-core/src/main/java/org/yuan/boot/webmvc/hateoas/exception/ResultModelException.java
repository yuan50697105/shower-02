package org.yuan.boot.webmvc.hateoas.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.hateoas.pojo.ResultModel;
import org.yuan.boot.webmvc.pojo.Result;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResultModelException extends Exception {
    private ResultModel resultModel;

    public ResultModelException(ResultModel resultModel) {
        this.resultModel = resultModel;
    }

    public ResultModelException(Result result) {
        this(new ResultModel(result));
    }
}
