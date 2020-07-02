package com.idea.shower.admin.admin.pojo;

import com.idea.shower.app.db.module.pojo.AdminRole;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-24 19:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminRoleVO extends AdminRole {
    private List<Long> permissionIds;

    /**
     * key :
     * description :
     * routes : []
     */

    private String description;
    private List<?> routes;

}