package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "org-yuan-boot-shower-pojo-SysUserRole")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysUserRole implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * roleId
     */
    @ApiModelProperty(value = "roleId")
    private Long roleId;

    /**
     * userId
     */
    @ApiModelProperty(value = "userId")
    private Long userId;

    /**
     * createUser
     */
    @ApiModelProperty(value = "createUser")
    private String createUser;

    /**
     * createTime
     */
    @ApiModelProperty(value = "createTime")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public static SysUserRoleBuilder builder() {
        return new SysUserRoleBuilder();
    }
}