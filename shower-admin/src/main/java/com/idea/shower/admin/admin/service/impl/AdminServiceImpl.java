package com.idea.shower.admin.admin.service.impl;

import com.idea.shower.admin.admin.service.AdminService;
import com.idea.shower.app.db.module.dao.AdminPermissionDao;
import com.idea.shower.app.db.module.dao.AdminRoleDao;
import com.idea.shower.app.db.module.dao.AdminUserDao;
import com.idea.shower.app.db.module.dao.AdminUserRoleDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    private final AdminPermissionDao adminPermissionService;

}