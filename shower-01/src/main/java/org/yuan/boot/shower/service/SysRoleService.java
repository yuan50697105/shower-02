package org.yuan.boot.shower.service;

import org.yuan.boot.shower.pojo.SysRole;
import org.yuan.boot.shower.pojo.condition.SysRoleCondition;
import org.yuan.boot.shower.pojo.vo.SysRoleVo;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:58
 */
public interface SysRoleService {
    Result selectPage(SysRoleCondition condition);

    Result selectList(SysRoleCondition condition);

    Result selectOne(SysRole sysRole);

    Result selectById(Long id);

    Result save(SysRoleVo sysRoleVo);

    Result update(SysRoleVo sysRoleVo);

    Result updatePermission(SysRoleVo sysRoleVo);

    Result delete(List<Long> ids);

    Result delete(Long id);
}
