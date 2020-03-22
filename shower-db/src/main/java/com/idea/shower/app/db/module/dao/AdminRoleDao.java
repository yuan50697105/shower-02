package com.idea.shower.app.db.module.dao;


import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.AdminRole;
import com.idea.shower.app.db.module.pojo.query.AdminRoleQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;

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
}
