package org.yuan.boot.shower.admin.service;

import org.yuan.boot.shower.admin.pojo.AdminRoleVo;
import org.yuan.boot.shower.db.pojo.AdminRoleCondition;
import org.yuan.boot.webmvc.exception.ResultRuntimeException;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 00:29
 */
public interface AdminRoleService {
    Result data(AdminRoleCondition condition);

    Result list(AdminRoleCondition condition);

    Result get(Long id);

    Result save(AdminRoleVo adminRoleVo);

    Result update(AdminRoleVo adminRoleVo);

    Result delete(Long id) throws ResultRuntimeException;

    Result delete(List<Long> ids);
}
