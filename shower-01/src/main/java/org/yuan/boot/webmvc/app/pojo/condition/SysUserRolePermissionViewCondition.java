package org.yuan.boot.webmvc.app.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.AbstractBaseCondition;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 23:56
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public final class SysUserRolePermissionViewCondition extends AbstractBaseCondition {
    public SysUserRolePermissionViewCondition() {
    }

    public SysUserRolePermissionViewCondition(int page, int size) {
        super(page, size);
    }
}