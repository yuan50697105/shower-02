package org.yuan.boot.shower.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.dao.SysPermissionDao;
import org.yuan.boot.shower.dao.SysRolePermissionDao;
import org.yuan.boot.shower.pojo.SysPermission;
import org.yuan.boot.shower.pojo.condition.SysPermissionCondition;
import org.yuan.boot.shower.pojo.converter.SysPermissionConverter;
import org.yuan.boot.shower.pojo.vo.SysPermissionVo;
import org.yuan.boot.shower.service.SysPermissionService;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:58
 */
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
@AllArgsConstructor
public class SysPermissionServiceImpl implements SysPermissionService {
    private SysPermissionDao sysPermissionDao;
    private SysRolePermissionDao sysRolePermissionDao;
    private SysPermissionConverter sysPermissionConverter;

    @Override
    public Result selectPage(SysPermissionCondition condition) {
        return Result.data(sysPermissionDao.page(condition));
    }

    @Override
    public Result selectList(SysPermissionCondition condition) {
        return Result.data(sysPermissionDao.list(condition));
    }

    @Override
    public Result selectOne(SysPermission permission) {
        return Result.data(sysPermissionDao.get(permission));
    }

    @Override
    public Result selectById(Long id) {
        return Result.data(sysPermissionDao.get(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result save(SysPermissionVo sysPermissionVo) {
        SysPermission sysPermission = sysPermissionConverter.convert(sysPermissionVo);
        sysPermissionDao.save(sysPermission);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result update(SysPermissionVo sysPermissionVo) {
        SysPermission sysPermission = sysPermissionConverter.convert(sysPermissionVo);
        sysPermissionDao.update(sysPermission);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result delete(Long id) {
        sysPermissionDao.delete(id);
        sysRolePermissionDao.deleteByPermissionId(id);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result delete(List<Long> ids) {
        sysPermissionDao.delete(ids);
        sysRolePermissionDao.deleteByPermissionIds(ids);
        return Result.ok();
    }
}