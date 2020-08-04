package com.idea.shower.admin.admin.service;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.admin.pojo.AdminRoleVO;
import com.idea.shower.app.db.module.pojo.query.AdminRoleQuery;

import java.util.List;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-25 17:15
 */
public interface AdminRoleBackService {
    Result<?> add(AdminRoleVO vo);

    Result<?> update(AdminRoleVO vo);

    Result<?> getForUpdate(Long id);

    Result<?> get(Long id);

    Result<?> data(AdminRoleQuery query, int page, int size);

    Result<?> list(AdminRoleQuery query);

    Result<?> delete(List<Long> id);
}
