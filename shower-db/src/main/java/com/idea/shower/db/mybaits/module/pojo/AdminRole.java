package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

/**
 * 管理员角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminRole extends BaseDbEntity {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_DATE = "create_date";
    public static final String COL_UPDATE_DATE = "update_date";
    public static final String COL_CREATE_USER = "create_user";
    public static final String COL_UPDATE_USER = "update_user";
    public static final String COL_NAME = "name";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_ENABLED = "enabled";
    public static final String COL_DELETED = "deleted";
    private static final long serialVersionUID = 1L;
    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * 逻辑删除
     */
    private Boolean deleted;
}