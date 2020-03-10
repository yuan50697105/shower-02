package com.idea.shower.app.commons.db.module.dao;

import com.idea.shower.db.mybaits.pojo.PageResult;
import com.idea.shower.app.commons.db.commons.dao.BaseDao;
import com.idea.shower.app.commons.db.module.pojo.AdminUser;
import com.idea.shower.app.commons.db.module.pojo.AdminUserQueryBaseConditionQuery;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 12:54
 */
public interface AdminUserDao extends BaseDao<AdminUser> {
    PageResult<AdminUser> selectPage(AdminUserQueryBaseConditionQuery condition);
}
