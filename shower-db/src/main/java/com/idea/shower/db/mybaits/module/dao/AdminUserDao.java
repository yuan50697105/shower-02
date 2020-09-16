package com.idea.shower.db.mybaits.module.dao;


import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import com.idea.shower.db.mybaits.commons.dao.CommonsDao;
import com.idea.shower.db.mybaits.module.pojo.AdminUser;
import com.idea.shower.db.mybaits.module.pojo.query.AdminUserQuery;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 16:21
 */
public interface AdminUserDao extends CommonsDao<AdminUser> {
    PageResult<AdminUser> selectPageByCondition(AdminUserQuery condition);

    List<AdminUser> selectListByCondition(AdminUserQuery condition);

    AdminUser getById(Long id);

    int insertSelective(AdminUser adminUser);

    int updateSelective(AdminUser adminUser);

    int deleteById(Long id);

    Optional<AdminUser> selectByIdOpt(Long id);

    int deleteByIds(List<Long> ids);

    AdminUser selectByUsername(String username);

    Optional<AdminUser> selectByUsernameOpt(String username);

    PageResult<AdminUser> selectPageByQuery(AdminUserQuery query, int page, int size);

    List<AdminUser> selectListByQuery(AdminUserQuery query);

    boolean existByUsername(String username);

    Long selectOneIdByUsername(String username);
}
