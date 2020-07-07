package com.idea.shower.admin.security.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.idea.shower.admin.security.pojo.JwtUser;
import com.idea.shower.admin.security.pojo.User;
import com.idea.shower.admin.security.service.UserDetailsAndRouteService;
import com.idea.shower.app.db.module.dao.AdminRoleDao;
import com.idea.shower.app.db.module.dao.AdminUserDao;
import com.idea.shower.app.db.module.dao.AdminUserRoleDao;
import com.idea.shower.app.db.module.pojo.AdminRole;
import com.idea.shower.app.db.module.pojo.AdminUser;
import com.idea.shower.app.db.module.pojo.AdminUserRole;
import com.idea.shower.db.mybaits.dao.AdminUserRouteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-07 21:58
 */
@Service
public class UserDetailsAndRouteServiceImpl implements UserDetailsAndRouteService {
    @Autowired
    private AdminUserDao adminUserDao;
    @Autowired
    private AdminRoleDao adminRoleDao;
    @Autowired
    private AdminUserRoleDao adminUserRoleDao;
    @Autowired
    private AdminUserRouteDao adminUserRouteDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AdminUser> optional = adminUserDao.selectByUsernameOpt(username);
        AdminUser adminUser = optional.orElseThrow(() -> new UsernameNotFoundException(username + "用户不存在"));
        List<AdminUserRole> adminUserRoles = adminUserRoleDao.listByUserId(adminUser.getId());
        List<Long> roleIds = adminUserRoles.stream().map(AdminUserRole::getRoleId).collect(Collectors.toList());
        List<AdminRole> adminRoles = adminRoleDao.listByIds(roleIds);
        List<String> roleNames = adminRoles.stream().map(AdminRole::getName).collect(Collectors.toList());
        return new JwtUser(new User(adminUser.getId(), adminUser.getUsername(), adminUser.getPassword(), roleNames));
    }

    @Override
    public Set<String> getRoleList(String username) {
        List<String> roleList = adminUserRoleDao.selectRoleNameByUsername(username);
        return new LinkedHashSet<>(roleList);
    }

    @Override
    public Set<String> getRouteList(String username) {
        List<String> routeList = adminUserRouteDao.selectRouteNameByUsername(username);
        return new LinkedHashSet<>(routeList);
    }
}