package org.yuan.boot.shower.db.dao;

import com.github.pagehelper.PageInfo;
import org.yuan.boot.shower.commons.dao.BaseDao;
import org.yuan.boot.shower.db.pojo.AdminRole;
import org.yuan.boot.shower.db.pojo.AdminRoleCondition;

import java.util.List;
import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:10
 */
public interface AdminRoleDao extends BaseDao<AdminRole> {
    List<AdminRole> selectByRoleIds(List<Long> roleIds);

    List<Long> selectRoleIdsByRoleIds(List<Long> roleIds);

    PageInfo<AdminRole> selectPage(AdminRoleCondition condition);

    List<AdminRole> selectList(AdminRoleCondition condition);

    Optional<AdminRole> getById(Long id);

    void save(AdminRole adminRole);

    void updateById(AdminRole adminRole);
}
