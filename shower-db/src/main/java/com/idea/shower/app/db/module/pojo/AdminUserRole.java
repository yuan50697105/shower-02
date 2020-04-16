package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 管理员用户角色关联
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminUserRole extends BaseDbEntity {
    private static final long serialVersionUID = 1L;
    /**
     * userId
     */
    private Long userId;

    /**
     * roleId
     */
    private Long roleId;

    public static AdminUserRoleBuilder builder() {
        return new AdminUserRoleBuilder();
    }
}