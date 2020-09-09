package com.idea.shower.db.mybaits.module.dao;


import com.idea.shower.db.mybaits.base.pojo.PageResult;
import com.idea.shower.db.mybaits.commons.dao.BaseDao;
import com.idea.shower.db.mybaits.module.pojo.AdminRole;
import com.idea.shower.db.mybaits.module.pojo.query.AdminRoleQuery;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 16:20
 */
public interface AdminRoleDao extends BaseDao<AdminRole> {
    PageResult<AdminRole> selectPageByCondition(AdminRoleQuery condition);

    List<AdminRole> selectListByCondition(AdminRoleQuery condition);

    AdminRole getById(Long id);

    List<Long> selectIdByIdIn(List<Long> roleIds);

    List<AdminRole> selectByIds(List<Long> roleIds);

    Optional<AdminRole> selectById(Long id);

    int insertSelective(AdminRole adminRole);

    int updateSelective(AdminRole adminRole);

    int deleteById(Long id);

    void deleteByIds(List<Long> id);

    PageResult<AdminRole> selectPageByQuery(AdminRoleQuery query, int page, int size);

    List<AdminRole> selectListByQuery(AdminRoleQuery query);

    boolean checkExistByName(String name);

    List<AdminRole> listByIds(List<Long> roleIds);

    List<String> selectNameByIds(List<Long> roleIds);
}
