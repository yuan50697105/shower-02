package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
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
     * 链接
     */
    private String url;

    /**
     * 名称
     */
    private String name;

    /**
     * 父类ID
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