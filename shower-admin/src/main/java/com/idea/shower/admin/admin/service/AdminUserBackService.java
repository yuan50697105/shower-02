package com.idea.shower.admin.admin.service;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.admin.pojo.AdminUserVO;
import com.idea.shower.app.db.module.pojo.query.AdminUserQuery;

import java.util.List;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-24 19:10
 */
public interface AdminUserBackService {
    Result<?> add(AdminUserVO vo);

    Result<?> modifyUser(AdminUserVO vo);

    Result<?> getUser(Long id);

    Result<?> getRole(Long id);

    Result<?> modifyRole(AdminUserVO vo);

    Result delete(List<Long> id);

    Result<?> data(AdminUserQuery query, int page, int size);

    Result<?> list(AdminUserQuery query);

    Result<?> get(Long id);

    Result<?> modify(AdminUserVO adminUserVO);
}
