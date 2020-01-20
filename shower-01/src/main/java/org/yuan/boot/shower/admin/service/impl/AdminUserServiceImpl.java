package org.yuan.boot.shower.admin.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.admin.converter.AdminUserConverter;
import org.yuan.boot.shower.admin.converter.AdminUserRoleConverter;
import org.yuan.boot.shower.admin.pojo.AdminUserVO;
import org.yuan.boot.shower.admin.service.AdminUserService;
import org.yuan.boot.shower.commons.utils.PageResults;
import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.shower.db.dao.AdminRoleDao;
import org.yuan.boot.shower.db.dao.AdminUserDao;
import org.yuan.boot.shower.db.dao.AdminUserRoleDao;
import org.yuan.boot.shower.db.pojo.AdminRole;
import org.yuan.boot.shower.db.pojo.AdminUser;
import org.yuan.boot.shower.db.pojo.AdminUserCondition;
import org.yuan.boot.shower.db.pojo.AdminUserRole;
import org.yuan.boot.webmvc.exception.ResultRuntimeException;
import org.yuan.boot.webmvc.pojo.Result;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 00:01
 */
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class AdminUserServiceImpl implements AdminUserService {
    private AdminUserDao adminUserDao;
    private AdminRoleDao adminRoleDao;
    private AdminUserRoleDao adminUserRoleDao;
    private AdminUserConverter adminUserConverter;
    private AdminUserRoleConverter adminUserRoleConverter;
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result save(AdminUserVO adminUserVO) {
        AdminUser adminUser = adminUserConverter.convertForSave(adminUserVO);
        adminUserDao.save(adminUser);
        adminUserVO.setRoleIds(new ArrayList<>(new HashSet<>(adminUserVO.getRoleIds())));
        adminUserVO.setRoleIds(adminRoleDao.selectRoleIdsByRoleIds(adminUserVO.getRoleIds()));
        List<AdminUserRole> adminUserRoles = adminUserRoleConverter.convertToUserRole(adminUser.getId(), adminUserVO.getRoleIds());
        adminUserRoleDao.batchSaveByUser(adminUserRoles);
        return Results.ok();
    }

    @Override
    public Result data(AdminUserCondition condition) {
        return Results.data(PageResults.of(adminUserDao.selectPage(condition)));
    }

    @Override
    public Result list(AdminUserCondition condition) {
        return Results.data(adminUserDao.selectList(condition));
    }

    @Override
    public Result get(Long id) {
        AdminUser adminUser = adminUserDao.getById(id);
        List<Long> roleIds = adminUserRoleDao.selectRoleIdsByUserId(id);
        List<AdminRole> adminRoles = adminRoleDao.selectByRoleIds(roleIds);
        return Results.data(adminUserConverter.convert(adminUser, adminRoles));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result changePwd(AdminUserVO adminUserVO) {
        @NotEmpty(groups = {AdminUserVO.Save.class}) String username = adminUserVO.getUsername();
        @NotEmpty(groups = {AdminUserVO.ChangePwd.class}) String password = adminUserVO.getPassword();
        @NotEmpty(groups = {AdminUserVO.ChangePwd.class}) String newPassword = adminUserVO.getNewPassword();
        AdminUser adminUser = adminUserDao.getByUsername(username);
        if (passwordEncoder.matches(password, adminUser.getPassword())) {
            throw new ResultRuntimeException(Results.userError("密码错误"));
        } else {
            newPassword = passwordEncoder.encode(newPassword);
            adminUser.setPassword(newPassword);
            adminUserDao.updateById(adminUser);
            return Results.ok();
        }

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result changeInfo(AdminUserVO adminUserVO) {
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result changeRole(AdminUserVO adminUserVO) {
        List<AdminUserRole> adminUserRoles = adminUserRoleConverter.convertToUserRole(adminUserVO);
        adminUserRoleDao.batchSave(adminUserRoles);
        return Results.ok();
    }

}