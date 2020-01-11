package org.yuan.boot.webmvc.app.service;

import org.yuan.boot.webmvc.app.pojo.SysPermission;
import org.yuan.boot.webmvc.app.pojo.condition.SysPermissionCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysPermissionVo;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:58
 */
public interface SysPermissionService {
    Result page(SysPermissionCondition condition);

    Result list(SysPermissionCondition condition);

    Result get(SysPermission permission);

    Result get(Long id);

    Result save(SysPermissionVo sysPermissionVo);

    Result update(SysPermissionVo sysPermissionVo);

    Result delete(Long id);

    Result delete(List<Long> ids);
}
