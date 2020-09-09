package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

/**
 * admin_route
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminRoute extends BaseDbEntity {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_DATE = "create_date";
    public static final String COL_UPDATE_DATE = "update_date";
    public static final String COL_CREATOR = "creator";
    public static final String COL_UPDATER = "updater";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_URL = "url";
    public static final String COL_NAME = "name";
    public static final String COL_PARENT_ID = "parent_id";
    public static final String COL_WEIGHT = "weight";
    public static final String COL_ROLE_ID = "role_id";
    private String delFlag;

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