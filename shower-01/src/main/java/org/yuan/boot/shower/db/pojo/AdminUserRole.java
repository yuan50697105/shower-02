package org.yuan.boot.shower.db.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

import java.io.Serializable;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 16:35
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class AdminUserRole extends BaseEntity<AdminUserRole> implements Serializable {
    private Long userId;
    private Long roleId;

    public AdminUserRole() {
    }

    @Builder
    public AdminUserRole(Long id, Long userId, Long roleId) {
        super(id);
        this.userId = userId;
        this.roleId = roleId;
    }
}