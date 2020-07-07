package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * admin_role_route
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminRoleRoute extends BaseDbEntity {
    /**
     * roleId
     */
    private Long roleId;

    /**
     * routeId
     */
    private Long routeId;
}