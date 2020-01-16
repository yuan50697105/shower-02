package org.yuan.boot.webmvc.app.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SysUserRolePermissionView extends BaseEntity<SysUserRolePermissionView> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;
    /**
     * username
     */
    private String username;
    /**
     * password
     */
    private String password;
    /**
     * realName
     */
    private String realName;
    /**
     * nickName
     */
    private String nickName;
    /**
     * createUser
     */
    private String createUser;
    /**
     * updateUser
     */
    private String updateUser;
    /**
     * createTime
     */
    private Date createTime;
    /**
     * updateTime
     */
    private Date updateTime;
    /**
     * enabled
     */
    private Byte enabled;
    /**
     * name
     */
    private String roleName;
    /**
     * name
     */
    private String permissionName;
}