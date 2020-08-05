package com.idea.shower.admin.admin.pojo;

import com.idea.shower.app.db.module.pojo.AdminUser;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-24 19:06
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminUserVO extends AdminUser {
    private List<Long> roleIds;
    private List<String> roleNames;
}