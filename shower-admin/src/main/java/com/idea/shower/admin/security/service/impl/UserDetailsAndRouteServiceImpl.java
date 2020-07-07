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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AdminUser adminUser = adminUserDao.selectByUsername(username);
        if (ObjectUtil.isEmpty(adminUser)) {
            throw new UsernameNotFoundException(username + "用户不存在");
        }
        List<Long> roleIds = adminUserRoleDao.selectRoleIdByUserId(adminUser.getId());
        List<AdminRole> adminRoles = adminRoleDao.selectByIds(roleIds);
        List<String> roleList = adminRoles.stream().map(AdminRole::getName).distinct().collect(Collectors.toList());
        return new JwtUser(new User(adminUser.getId(), adminUser.getUsername(), adminUser.getPassword(), roleList));
    }
}