package org.yuan.boot.webmvc.app.service.impl;

import org.springframework.stereotype.Service;
import org.yuan.boot.db.service.impl.BaseDbServiceImpl;
import org.yuan.boot.webmvc.app.mapper.SysRoleMapper;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.condition.SysRoleCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;
import org.yuan.boot.webmvc.app.service.SysRoleService;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-01 18:13
 */
@Service
public class SysRoleServiceImpl extends BaseDbServiceImpl<SysRole, Long, SysRoleMapper> implements SysRoleService {
    @Override
    public Result page(SysRoleCondition condition) {
        return null;
    }

    @Override
    public Result list(SysRoleCondition condition) {
        return null;
    }

    @Override
    public Result get(SysRole sysRole) {
        return null;
    }

    @Override
    public Result get(Long id) {
        return null;
    }

    @Override
    public Result save(SysRoleVo sysRoleVo) {
        return null;
    }
}