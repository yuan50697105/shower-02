package org.yuan.boot.shower.db.dao;

import org.yuan.boot.shower.commons.dao.BaseDao;
import org.yuan.boot.shower.db.pojo.AdminRole;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:10
 */
public interface AdminRoleDao extends BaseDao<AdminRole> {
    List<AdminRole> selectByRoleIds(List<Long> roleIds);

    List<Long> selectRoleIdsByRoleIds(List<Long> roleIds);
}
