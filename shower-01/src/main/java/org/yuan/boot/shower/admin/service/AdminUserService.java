package org.yuan.boot.shower.admin.service;

import org.yuan.boot.shower.admin.pojo.AdminUserVO;
import org.yuan.boot.shower.db.pojo.AdminUserCondition;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 00:00
 */
public interface AdminUserService {
    Result save(AdminUserVO adminUserVO);

    Result data(AdminUserCondition condition);

    Result list(AdminUserCondition condition);

    Result get(Long id);

    Result changePwd(AdminUserVO adminUserVO);

    Result changeInfo(AdminUserVO adminUserVO);

    Result changeRole(AdminUserVO adminUserVO);

    Result delete(Long id);

    Result delete(List<Long> ids);
}
