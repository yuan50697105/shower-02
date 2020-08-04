package com.idea.shower.admin.admin.service;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.admin.pojo.AdminPermissionVO;
import com.idea.shower.app.db.module.pojo.query.AdminPermissionQuery;

import java.util.List;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-25 18:40
 */
public interface AdminPermissionBackService {
    Result<?> add(AdminPermissionVO vo);

    Result<?> modify(AdminPermissionVO vo);

    Result<?> delete(List<Long> ids);

    Result<?> get(Long id);

    Result<?> data(AdminPermissionQuery query, int page, int size);

    Result<?> list(AdminPermissionQuery query);


}
