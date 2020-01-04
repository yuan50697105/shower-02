package org.yuan.boot.webmvc.app.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.*;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.BaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SysPermission extends BaseEntity<SysPermission> implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * authority
     */
    private String authority;

    /**
     * name
     */
    private String name;

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
    private Integer enabled;

    public static SysPermissionBuilder builder() {
        return new SysPermissionBuilder();
    }
}