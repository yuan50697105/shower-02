package org.yuan.boot.webmvc.app.service.impl;

import cn.hutool.core.lang.Snowflake;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.webmvc.app.dao.SysRoleDao;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.condition.SysRoleCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysRoleConverter;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;
import org.yuan.boot.webmvc.app.service.SysRoleService;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:58
 */
@Service
@AllArgsConstructor
public class SysRoleServiceImpl implements SysRoleService {
    private SysRoleConverter sysRoleConverter;
    private SysRoleDao sysRoleDao;

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
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result update(SysRoleVo sysRoleVo) {
        SysRole sysRole = sysRoleConverter.convert(sysRoleVo);
        sysRoleDao.update(sysRole);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result delete(List<Long> ids) {
        sysRoleDao.delete(ids);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result delete(Long id) {
        sysRoleDao.delete(id);
        return Result.ok();
    }
}