package org.yuan.boot.webmvc.app.pojo.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-05 19:22
 */
@Data
@ApiModel
public final class BaseCustomerInfoVo {
    @NotEmpty(groups = {Update.class})
    private Long id;
    @NotEmpty(groups = {Save.class})
    private String actualName;
    @NotEmpty(groups = {Save.class})
    private String contactAddress;
    @NotEmpty(groups = {Save.class})
    private String contactNumber;
    @NotEmpty(groups = {Save.class})
    private String identityNumber;

    public interface Save {
    }

    public interface Update {
    }


}