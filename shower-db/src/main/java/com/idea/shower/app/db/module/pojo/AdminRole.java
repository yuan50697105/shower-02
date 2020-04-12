package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import lombok.*;

import java.io.Serializable;

/**
 * 管理员角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminRole extends BaseDbEntity implements Serializable {
    /**
     * name
     */
    private String name;

    private static final long serialVersionUID = 1L;

    public static AdminRoleBuilder builder() {
        return new AdminRoleBuilder();
    }
}