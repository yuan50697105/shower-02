package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminRole extends BaseDbEntity {
    /**
     * name
     */
    private String name;

    public static AdminRoleBuilder builder() {
        return new AdminRoleBuilder();
    }
}