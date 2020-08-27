package com.idea.shower.admin.admin.pojo;

import com.idea.shower.db.mybaits.module.pojo.AdminRole;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-21 21:07
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminRoleEditVo extends AdminRole {
    private List<String> routes = new ArrayList<>();
}