package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminUserRole extends BaseDbEntity {
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