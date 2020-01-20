package org.yuan.boot.shower.db.dao;

import com.github.pagehelper.PageInfo;
import org.yuan.boot.shower.commons.dao.BaseDao;
import org.yuan.boot.shower.db.pojo.AdminUser;
import org.yuan.boot.shower.db.pojo.AdminUserCondition;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:10
 */
public interface AdminUserDao extends BaseDao<AdminUser> {
    void save(AdminUser convertForSave);

    PageInfo<AdminUser> selectPage(AdminUserCondition condition);

    List<AdminUser> selectList(AdminUserCondition condition);

    AdminUser getById(Long id);

    AdminUser getByUsername(String username);

    void updateById(AdminUser adminUser);
}
