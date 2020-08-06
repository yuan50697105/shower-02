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
public interface AdminUserService {
    /**
     * @param vo
     * @return
     */
    Result<?> add(AdminUserVO vo);

    /**
     * @param vo
     * @return
     */
    Result<?> modifyUser(AdminUserVO vo);

    /**
     * @param id
     * @return
     */
    Result<?> getUser(Long id);

    /**
     * @param id
     * @return
     */
    Result<?> getRole(Long id);

    /**
     * @param vo
     * @return
     */
    Result<?> modifyRole(AdminUserVO vo);

    /**
     * @param id
     * @return
     */
    Result delete(List<Long> id);

    /**
     * @param query
     * @param page
     * @param size
     * @return
     */
    Result<?> data(AdminUserQuery query, int page, int size);

    /**
     * @param query
     * @return
     */
    Result<?> list(AdminUserQuery query);

    /**
     * @param id
     * @return
     */
    Result<?> get(Long id);

    /**
     * @param adminUserVO
     * @return
     */
    Result<?> modify(AdminUserVO adminUserVO);
}
