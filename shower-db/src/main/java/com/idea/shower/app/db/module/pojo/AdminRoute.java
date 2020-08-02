package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * admin_route
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminRoute extends BaseDbEntity {
    /**
     * url
     */
    private String url;

    /**
     * name
     */
    private String name;

    /**
     * parentId
     */
    private Long parentId;

    /**
     * weight
     */
    private Integer weight;

    /**
     * 角色ID
     */
    private Long roleId;
}