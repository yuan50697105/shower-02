package com.idea.shower.admin.admin.pojo;

import com.idea.shower.admin.route.pojo.RouteBean;
import com.idea.shower.db.mybaits.module.pojo.AdminRole;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
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
    private List<RouteBean> routes = new ArrayList<>();
    private List<String> resources = new ArrayList<>();
}