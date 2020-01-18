package org.yuan.boot.shower.service;

import org.yuan.boot.shower.pojo.SysPermission;
import org.yuan.boot.shower.pojo.condition.SysPermissionCondition;
import org.yuan.boot.shower.pojo.vo.SysPermissionVo;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:58
 */
public interface SysPermissionService {
    Result selectPage(SysPermissionCondition condition);

    Result selectList(SysPermissionCondition condition);

    Result selectOne(SysPermission permission);

    Result selectById(Long id);

    Result save(SysPermissionVo sysPermissionVo);

    Result update(SysPermissionVo sysPermissionVo);

    Result delete(Long id);

    Result delete(List<Long> ids);
}
