package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.util.Date;

/**
 * 管理员权限
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminPermission extends BaseDbEntity {
    /**
     * id
     */
    private Long id;

    /**
     * createTime
     */
    private Date createDate;

    /**
     * updateTime
     */
    private Date updateDate;

    /**
     * createUser
     */
    private Long creator;

    /**
     * updateUser
     */
    private Long updater;

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