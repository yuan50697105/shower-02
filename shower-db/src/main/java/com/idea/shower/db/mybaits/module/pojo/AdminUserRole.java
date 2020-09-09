package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.util.Date;

/**
 * 管理员用户角色关联
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminUserRole extends BaseDbEntity {
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
    private String creator;

    /**
     * updateUser
     */
    private String updater;

    private String delFlag;

    /**
     * userId
     */
    private Long userId;

    /**
     * roleId
     */
    private Long roleId;
}