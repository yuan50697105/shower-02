package org.yuan.boot.webmvc.hateoas.pojo;

import cn.hutool.http.HttpStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @author yuane
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResultModel extends RepresentationModel<ResultModel> {
    private int code;
    private String message;

    public ResultModel() {
        this.code = HttpStatus.HTTP_OK;
        this.message = Result.OK_MESSAGE;
    }

    public ResultModel(Link initialLink) {
        super(initialLink);
        this.code = HttpStatus.HTTP_OK;
        this.message = Result.OK_MESSAGE;
    }

    public ResultModel(List<Link> initialLinks) {
        super(initialLinks);
        this.code = HttpStatus.HTTP_OK;
        this.message = Result.OK_MESSAGE;
    }

    public ResultModel(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultModel(int code, String message, Link initialLink) {
        super(initialLink);
        this.code = code;
        this.message = message;
    }

    public ResultModel(int code, String message, List<Link> initialLinks) {
        super(initialLinks);
        this.code = code;
        this.message = message;
    }

    public ResultModel(Result result) {
        this.code = result.getCode();
        this.message = result.getMessage();
    }

    public ResultModel(Result result, Link initialLink) {
        super(initialLink);
        this.code = result.getCode();
        this.message = result.getMessage();
    }

    public ResultModel(Result result, List<Link> initialLinks) {
        super(initialLinks);
        this.code = result.getCode();
        this.message = result.getMessage();
    }
}
