package org.yuan.boot.webmvc.app.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-02 22:15
 */
@ApiModel("权限模型")
@Data
public final class SysPermissionVo {
    @ApiModelProperty("主键")
    @NotEmpty(groups = {Update.class})
    private Long id;
    @ApiModelProperty(value = "权限描述", required = true)
    @NotEmpty(groups = {Save.class, Update.class})
    private String authority;
    @ApiModelProperty(value = "名称", required = true)
    @NotEmpty(groups = {Save.class, Update.class})
    private String name;

    public interface Save {
    }

    public interface Update {
    }
}