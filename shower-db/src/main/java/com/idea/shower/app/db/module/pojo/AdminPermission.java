package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import lombok.*;

import java.io.Serializable;

/**
 * 管理员权限
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminPermission extends BaseDbEntity implements Serializable {
    /**
     * name
     */
    private String name;

    private static final long serialVersionUID = 1L;

    public static AdminPermissionBuilder builder() {
        return new AdminPermissionBuilder();
    }
}