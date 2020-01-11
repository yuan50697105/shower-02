package org.yuan.boot.webmvc.app.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.webmvc.app.dao.SysRoleDao;
import org.yuan.boot.webmvc.app.dao.SysRolePermissionDao;
import org.yuan.boot.webmvc.app.dao.SysUserRoleDao;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.SysRolePermission;
import org.yuan.boot.webmvc.app.pojo.condition.SysRoleCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysRoleConverter;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;
import org.yuan.boot.webmvc.app.service.SysRoleService;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:58
 */
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class SysRoleServiceImpl implements SysRoleService {
    private SysRoleConverter sysRoleConverter;
    private SysRoleDao sysRoleDao;
    private SysRolePermissionDao sysRolePermissionDao;
    private SysUserRoleDao sysUserRoleDao;

    @Override
    public Result page(SysRoleCondition condition) {
        return Result.data(sysRoleDao.page(condition));
    }

    @Override
    public Result list(SysRoleCondition condition) {
        return Result.data(sysRoleDao.list(condition));
    }

    @Override
    public Result get(SysRole sysRole) {
        return Result.data(sysRoleDao.get(sysRole));
    }

    @Override
    public Result get(Long id) {
        return Result.data(sysRoleDao.get(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result save(SysRoleVo sysRoleVo) {
        SysRole sysRole = sysRoleConverter.convert(sysRoleVo);
        sysRoleDao.save(sysRole);
        ArrayList<SysRolePermission> sysRolePermissions = new ArrayList<>(sysRoleVo.getPermissionIds().size());
        for (Long permissionId : sysRoleVo.getPermissionIds()) {
            sysRolePermissions.add(new SysRolePermission().setRoleId(sysRole.getId()).setPermissionId(permissionId));
        }
        sysRolePermissionDao.batchSave(sysRolePermissions);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result update(SysRoleVo sysRoleVo) {
        SysRole sysRole = sysRoleConverter.convert(sysRoleVo);
        sysRoleDao.update(sysRole);
        ArrayList<SysRolePermission> sysRolePermissions = new ArrayList<>(sysRoleVo.getPermissionIds().size());
        for (Long permissionId : sysRoleVo.getPermissionIds()) {
            sysRolePermissions.add(new SysRolePermission().setRoleId(sysRole.getId()).setPermissionId(permissionId));
        }
        sysRolePermissionDao.batchUpdate(sysRole, sysRolePermissions);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result changePermission(SysRoleVo sysRoleVo) {
        Long roleId = sysRoleVo.getId();
        List<Long> permissionIds = sysRoleVo.getPermissionIds();
        ArrayList<SysRolePermission> sysRolePermissions = new ArrayList<>(permissionIds.size());
        for (Long permissionId : permissionIds) {
            sysRolePermissions.add(new SysRolePermission().setRoleId(roleId).setPermissionId(permissionId));
        }
        sysRolePermissionDao.batchUpdate(new SysRole().setId(roleId), sysRolePermissions);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result delete(List<Long> ids) {
        sysRoleDao.delete(ids);
        sysUserRoleDao.deleteByRoleIds(ids);
        sysRolePermissionDao.deleteByRoleIds(ids);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result delete(Long id) {
        sysRoleDao.delete(id);
        sysUserRoleDao.deleteByRoleId(id);
        sysRolePermissionDao.deleteByRoleId(id);
        return Result.ok();
    }
}