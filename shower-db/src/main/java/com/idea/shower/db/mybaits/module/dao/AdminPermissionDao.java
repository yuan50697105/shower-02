package com.idea.shower.db.mybaits.module.dao;


import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import com.idea.shower.db.mybaits.commons.dao.CommonsDao;
import com.idea.shower.db.mybaits.module.pojo.AdminPermission;
import com.idea.shower.db.mybaits.module.pojo.query.AdminPermissionQuery;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 16:15
 */
public interface AdminPermissionDao extends CommonsDao<AdminPermission> {
    PageResult<AdminPermission> selectPageByCondition(AdminPermissionQuery condition);

    List<AdminPermission> selectListByCondition(AdminPermissionQuery condition);

    List<AdminPermission> selectByIds(List<Long> permissionIds);

    List<Long> selectIdByIds(List<Long> permissionIds);

    Optional<AdminPermission> selectById(Long id);


    int insertSelective(AdminPermission adminPermission);

    int updateSelective(AdminPermission adminPermission);

    AdminPermission getById(Long id);

    void deleteByIds(List<Long> ids);

    PageResult<AdminPermission> selectPageByQuery(AdminPermissionQuery query, int page, int size);

    List<AdminPermission> selectListByQuery(AdminPermissionQuery query);

    int deleteByRoleIds(List<Long> id);

    List<AdminPermission> selectListByRoleId(Long id);

    List<String> selectNameListByRoleId(Long id);

    List<String> selectPermissionListByUsername(String username);

    List<AdminPermission> selectAllByRoleId(Long roleId);

	List<String> selectNameByRoleId(Long roleId);

	List<String> selectNameByRoleIdIn(Collection<Long> roleIdCollection);

    int deleteById(Long id);
}
