package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 管理员角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminRole extends BaseDbEntity implements Serializable {
    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色描述
     */
    private String desc;

    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * 逻辑删除
     */
    private Boolean deleted;

    private static final long serialVersionUID = 1L;
}