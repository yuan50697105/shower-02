package org.yuan.boot.shower.admin.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.shower.db.pojo.AdminRole;
import org.yuan.boot.shower.db.pojo.AdminUser;

import java.util.Set;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 00:15
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminUserQueryResult extends AdminUser {
    @Accessors(chain = true)
    private Set<AdminRole> roles;
}