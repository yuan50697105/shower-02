package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

/**
 * 管理员权限
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminPermission extends BaseDbEntity {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_DATE = "create_date";
    public static final String COL_UPDATE_DATE = "update_date";
    public static final String COL_CREATOR = "creator";
    public static final String COL_UPDATER = "updater";
    public static final String COL_NAME = "name";
    public static final String COL_ROLE_ID = "role_id";
    public static final String COL_DEL_FLAG = "del_flag";
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    private String name;

    /**
     * 角色ID
     */
    private Long roleId;

    private String delFlag;
}