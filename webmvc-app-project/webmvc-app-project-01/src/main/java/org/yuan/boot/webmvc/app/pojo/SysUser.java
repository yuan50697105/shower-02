package org.yuan.boot.webmvc.app.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "org-yuan-boot-webmvc-app-pojo-SysUser")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public final class SysUser extends BaseEntity<SysUser> implements Serializable {
    private static final long serialVersionUID = 1L;
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

}