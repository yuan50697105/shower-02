package com.idea.shower.shower.app.db.dao;

import com.idea.shower.db.mybaits.pojo.PageResult;
import com.idea.shower.shower.app.commons.dao.BaseDao;
import com.idea.shower.shower.app.db.pojo.AdminUser;
import com.idea.shower.shower.app.db.pojo.AdminUserQueryBase;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 12:54
 */
public interface AdminUserDao extends BaseDao<AdminUser> {
    PageResult<AdminUser> selectPage(AdminUserQueryBase condition);
}
