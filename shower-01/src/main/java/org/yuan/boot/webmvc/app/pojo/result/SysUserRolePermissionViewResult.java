package org.yuan.boot.webmvc.app.pojo.result;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 23:04
 */
@Data
public final class SysUserRolePermissionViewResult {
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

    private Set<SysRoleResult> roles;
    private Set<SysPermissionResult> permissions;

    @Data
    public static final class SysRoleResult {
        private Long id;
        private String name;
    }

    @Data
    public static final class SysPermissionResult {
        private Long id;
        private String name;
    }

}