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
public interface AdminPermissionService {
    /**
     * 体检权限
     *
     * @param vo 表单
     * @return 处理结果封装
     */
    Result<?> add(AdminPermissionVO vo);

    /**
     * 修改权限
     *
     * @param vo 表单
     * @return 处理结果封装
     */
    Result<?> modify(AdminPermissionVO vo);

    /**
     * 删除权限
     *
     * @param ids 权限ID列表
     * @return 处理结果
     */
    Result<?> delete(List<Long> ids);

    /**
     * 获取权限
     *
     * @param id ID
     * @return 处理结果，包含数据
     */
    Result<?> get(Long id);

    /**
     * 分页
     *
     * @param query 查询条件封装
     * @param page  单签页码
     * @param size  分页大小
     * @return 处理结果，分页数据
     */
    Result<?> data(AdminPermissionQuery query, int page, int size);

    /**
     * 列表查询
     *
     * @param query 查询条件
     * @return 处理结果，列表数据
     */
    Result<?> list(AdminPermissionQuery query);


}
