package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "org-yuan-boot-shower-pojo-SysRole")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysRole implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;

    /**
     * createUser
     */
    @ApiModelProperty(value = "createUser")
    private String createUser;

    /**
     * updateUser
     */
    @ApiModelProperty(value = "updateUser")
    private String updateUser;

    /**
     * createTime
     */
    @ApiModelProperty(value = "createTime")
    private Date createTime;

    /**
     * updateTime
     */
    @ApiModelProperty(value = "updateTime")
    private Date updateTime;

    /**
     * enabled
     */
    @ApiModelProperty(value = "enabled")
    private Integer enabled;

    private static final long serialVersionUID = 1L;

    public static SysRoleBuilder builder() {
        return new SysRoleBuilder();
    }
}