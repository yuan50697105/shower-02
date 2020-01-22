package org.yuan.boot.shower.admin.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.utils.PageResults;
import org.yuan.boot.shower.admin.converter.AdminRoleConverter;
import org.yuan.boot.shower.admin.pojo.AdminRoleVo;
import org.yuan.boot.shower.admin.service.AdminRoleService;
import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.shower.db.dao.AdminRoleDao;
import org.yuan.boot.shower.db.dao.AdminUserRoleDao;
import org.yuan.boot.shower.db.pojo.AdminRole;
import org.yuan.boot.shower.db.pojo.AdminRoleCondition;
import org.yuan.boot.webmvc.exception.ResultRuntimeException;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 00:29
 */
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class AdminRoleServiceImpl implements AdminRoleService {
    private AdminRoleDao adminRoleDao;
    private AdminRoleConverter adminRoleConverter;
    private AdminUserRoleDao adminUserRoleDao;

    @Override
    public Result data(AdminRoleCondition condition) {
        return Results.data(PageResults.of(adminRoleDao.selectPage(condition)));
    }

    @Override
    public Result list(AdminRoleCondition condition) {
        return Results.data(adminRoleDao.selectList(condition));
    }

    @Override
    public Result get(Long id) {
        return Results.data(adminRoleDao.getById(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result save(AdminRoleVo adminRoleVo) {
        AdminRole adminRole = adminRoleConverter.convertForSave(adminRoleVo);
        adminRoleDao.save(adminRole);
        return Results.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result update(AdminRoleVo adminRoleVo) {
        AdminRole adminRole = adminRoleConverter.convertForUpdate(adminRoleVo);
        adminRoleDao.updateById(adminRole);
        return Results.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result delete(Long id) throws ResultRuntimeException {
        if (adminUserRoleDao.existByRoleId(id)) {
            throw new ResultRuntimeException(Results.operateError("存在管理员用户使用，不能删除"));
        }
        adminUserRoleDao.deleteByRoleId(id);
        adminRoleDao.delete(id);
        return Results.ok();
    }

}