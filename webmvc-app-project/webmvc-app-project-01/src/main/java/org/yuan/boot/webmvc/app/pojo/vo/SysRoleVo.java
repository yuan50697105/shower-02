package org.yuan.boot.webmvc.app.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-01 18:16
 */
@ApiModel("角色模型")
@Data
public final class SysRoleVo {
    @ApiModelProperty(value = "主键")
    @NotEmpty(groups = {Update.class})
    private Long id;
    @ApiModelProperty(value = "名称")
    @NotEmpty(groups = {Save.class, Update.class})
    private String name;
    @ApiModelProperty(value = "权限描述")
    @NotEmpty(groups = {Save.class, Update.class})
    private String authority;
    @ApiModelProperty(value = "权限列表")
    @NotEmpty(groups = {Save.class, Update.class})
    private List<Long> permissionIds;

    public interface Save {
    }

    public interface Update {
    }


}