package com.idea.shower.app.commons.db.module.pojo;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.app.commons.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class AdminRole extends BaseEntity implements Serializable {
    /**
     * 角色名
     */
    private String name;

    /**
     * 启用状态（1 启用，0 停用）
     */
    private Integer enabled;

    private static final long serialVersionUID = 1L;
}