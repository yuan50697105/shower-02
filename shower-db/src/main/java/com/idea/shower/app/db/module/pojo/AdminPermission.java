package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 管理员权限
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminPermission extends BaseDbEntity {
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    private String name;

    public static AdminPermissionBuilder builder() {
        return new AdminPermissionBuilder();
    }
}