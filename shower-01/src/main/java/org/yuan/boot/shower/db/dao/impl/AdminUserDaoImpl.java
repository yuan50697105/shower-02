package org.yuan.boot.shower.db.dao.impl;

import org.springframework.stereotype.Component;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.db.dao.AdminUserDao;
import org.yuan.boot.shower.db.mapper.AdminUserMapper;
import org.yuan.boot.shower.db.pojo.AdminUser;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:10
 */
@Component
public class AdminUserDaoImpl extends BaseDaoImpl<AdminUser, AdminUserMapper> implements AdminUserDao {
}