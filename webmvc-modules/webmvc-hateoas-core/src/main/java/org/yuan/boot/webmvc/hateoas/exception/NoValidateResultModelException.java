package org.yuan.boot.webmvc.hateoas.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.hateoas.pojo.ResultModel;
import org.yuan.boot.webmvc.pojo.Result;

@EqualsAndHashCode(callSuper = true)
@Data
public class NoValidateResultModelException extends ResultModelException {
    public NoValidateResultModelException(ResultModel resultModel) {
        super(resultModel);
    }

    public NoValidateResultModelException(Result result) {
        super(result);
    }
}
