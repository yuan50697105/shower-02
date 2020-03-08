package com.idea.shower.shower.db.dao;

import com.idea.shower.db.pojo.PageResult;
import com.idea.shower.shower.commons.dao.BaseDao;
import com.idea.shower.shower.db.pojo.AdminUser;
import com.idea.shower.shower.db.pojo.AdminUserCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 12:54
 */
public interface AdminUserDao extends BaseDao<AdminUser> {
    PageResult<AdminUser> selectPage(AdminUserCondition condition);
}
