package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.io.Serializable;

/**
 * 管理员用户角色关联
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminUserRole extends BaseDbEntity implements Serializable {
    /**
     * userId
     */
    private Long userId;

    /**
     * roleId
     */
    private Long roleId;

    private static final long serialVersionUID = 1L;
}