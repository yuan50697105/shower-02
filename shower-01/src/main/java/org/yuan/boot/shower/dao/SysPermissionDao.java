package org.yuan.boot.shower.dao;

import org.yuan.boot.shower.pojo.SysPermission;
import org.yuan.boot.shower.pojo.condition.SysPermissionCondition;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 13:15
 */
public interface SysPermissionDao extends BaseDao<SysPermission> {
    Result page(SysPermissionCondition condition);

    Result list(SysPermissionCondition condition);

    Result get(SysPermission sysPermission);

    Result get(Long id);

    Result save(SysPermission sysPermission);

    Result update(SysPermission sysPermissionVo);

    Result delete(Long id);

    Result delete(List<Long> ids);

    List<Long> selectByIds(List<Long> permissionIds);
}
