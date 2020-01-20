package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class AdminUserRole implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;

    private static final long serialVersionUID = 1L;

    public static org.yuan.boot.shower.db.pojo.AdminUserRole.AdminUserRoleBuilder builder() {
        return new org.yuan.boot.shower.db.pojo.AdminUserRole.AdminUserRoleBuilder();
    }
}