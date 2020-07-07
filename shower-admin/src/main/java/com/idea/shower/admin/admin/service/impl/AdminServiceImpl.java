package com.idea.shower.admin.admin.service.impl;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import com.idea.shower.admin.admin.pojo.LoginUser;
import com.idea.shower.admin.admin.service.AdminService;
import com.idea.shower.app.db.module.dao.*;
import com.idea.shower.app.db.module.pojo.AdminRole;
import com.idea.shower.app.db.module.pojo.AdminUser;
import com.idea.shower.app.db.module.pojo.AdminUserRole;
import com.idea.shower.admin.security.pojo.JwtUser;
import com.idea.shower.admin.security.pojo.User;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-31 10:27
 */
@Service
@AllArgsConstructor
@Transactional
public class AdminServiceImpl implements AdminService {
    private final AdminUserDao adminUserService;
    private final AdminUserRoleDao adminUserRoleService;
    private final AdminRoleDao adminRoleService;
    private final AdminRolePermissionDao adminRolePermissionService;
    private final AdminPermissionDao adminPermissionService;

    @Override
    public Result<?> doLogin(LoginUser user) {
        return ResultInfo.success();
    }

    @Override
    public Set<String> getRoleList(String username) {
        AdminUser adminUser=adminUserService.selectByUsername(username);
        Long id = adminUser.getId();
        List<Long> roleIds = adminUserRoleService.listByUserId(id).stream().map(AdminUserRole::getRoleId).collect(Collectors.toList());
        return adminRoleService.listByIds(roleIds).stream().map(AdminRole::getName).collect(Collectors.toSet());
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AdminUser> optional = adminUserService.selectByUsernameOpt(username);
        AdminUser adminUser = optional.orElseThrow(() -> new UsernameNotFoundException(username + "用户不存在"));
        List<AdminUserRole> adminUserRoles = adminUserRoleService.listByUserId(adminUser.getId());
        List<Long> roleIds = adminUserRoles.stream().map(AdminUserRole::getRoleId).collect(Collectors.toList());
        List<AdminRole> adminRoles = adminRoleService.listByIds(roleIds);
        List<String> roleNames = adminRoles.stream().map(AdminRole::getName).collect(Collectors.toList());
        return new JwtUser(new User(adminUser.getId(), adminUser.getUsername(), adminUser.getPassword(), roleNames));
    }
}