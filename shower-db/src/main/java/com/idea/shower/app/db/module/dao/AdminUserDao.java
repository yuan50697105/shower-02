package com.idea.shower.app.db.module.dao;


import com.idea.shower.app.db.module.pojo.AdminUserQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;
import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.AdminUser;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 12:54
 */
public interface AdminUserDao extends BaseDao<AdminUser> {
    PageResult<AdminUser> selectPage(AdminUserQuery condition);
}
