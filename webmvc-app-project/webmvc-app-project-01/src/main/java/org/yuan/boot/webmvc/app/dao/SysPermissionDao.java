package org.yuan.boot.webmvc.app.dao;

import org.yuan.boot.webmvc.app.pojo.SysPermission;
import org.yuan.boot.webmvc.app.pojo.condition.SysPermissionCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysPermissionVo;
import org.yuan.boot.webmvc.pojo.Result;

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

    Result save(SysPermissionVo sysPermissionVo);

    Result update(SysPermissionVo sysPermissionVo);

    Result delete(Long id);

    Result delete(Long[] ids);
}
