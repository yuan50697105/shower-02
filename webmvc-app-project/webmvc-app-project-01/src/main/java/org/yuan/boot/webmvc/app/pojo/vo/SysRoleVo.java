package org.yuan.boot.webmvc.app.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.validate.SaveOrUpdateValidate;
import org.yuan.boot.webmvc.app.pojo.validate.SaveValidate;

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
    private Long id;
    @ApiModelProperty(value = "名称", required = true)
    @NotEmpty(groups = SaveOrUpdateValidate.class)
    private String name;
    @ApiModelProperty(value = "权限描述", required = true)
    @NotEmpty(groups = SaveOrUpdateValidate.class)
    private String authority;
    @ApiModelProperty(value = "权限列表", required = true)
    @NotEmpty(groups = SaveValidate.class)
    private List<Long> permissionIds;
}