package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "org-yuan-boot-shower-pojo-SysUser")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysUser implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * username
     */
    @ApiModelProperty(value = "username")
    private String username;

    /**
     * password
     */
    @ApiModelProperty(value = "password")
    private String password;

    /**
     * realName
     */
    @ApiModelProperty(value = "realName")
    private String realName;

    /**
     * nickName
     */
    @ApiModelProperty(value = "nickName")
    private String nickName;

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
    private Byte enabled;

    private static final long serialVersionUID = 1L;

    public static SysUserBuilder builder() {
        return new SysUserBuilder();
    }
}