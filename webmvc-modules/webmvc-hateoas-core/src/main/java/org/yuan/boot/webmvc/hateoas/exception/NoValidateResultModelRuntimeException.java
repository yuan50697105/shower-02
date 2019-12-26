package org.yuan.boot.webmvc.hateoas.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.hateoas.pojo.ResultModel;
import org.yuan.boot.webmvc.pojo.Result;

@EqualsAndHashCode(callSuper = true)
@Data
public class NoValidateResultModelRuntimeException extends ResultModelRuntimeException {
    public NoValidateResultModelRuntimeException(ResultModel resultModel) {
        super(resultModel);
    }

    public NoValidateResultModelRuntimeException(Result result) {
        super(result);
    }

}
