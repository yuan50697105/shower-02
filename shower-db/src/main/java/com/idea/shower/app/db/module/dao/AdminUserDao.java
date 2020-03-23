package com.idea.shower.app.db.module.dao;


import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.AdminUser;
import com.idea.shower.app.db.module.pojo.query.AdminUserQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 16:21
 */
public interface AdminUserDao extends BaseDao<AdminUser> {
    PageResult<AdminUser> selectPageByCondition(AdminUserQuery condition);

    List<AdminUser> selectListByCondition(AdminUserQuery condition);

    AdminUser getById(Long id);

    int insertSelective(AdminUser adminUser);

    int updateSelective(AdminUser adminUser);

    int deleteById(Long id);

    Optional<AdminUser> selectById(Long id);

    int deleteByIds(List<Long> ids);
}
