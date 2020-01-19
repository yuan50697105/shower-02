package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "org-yuan-boot-shower-pojo-SysRolePermission")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysRolePermission implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private Long roleId;

    @ApiModelProperty(value = "")
    private Long permissionId;

    @ApiModelProperty(value = "")
    private Date createTime;

    @ApiModelProperty(value = "")
    private Long createUser;

    private static final long serialVersionUID = 1L;

    public static SysRolePermissionBuilder builder() {
        return new SysRolePermissionBuilder();
    }
}