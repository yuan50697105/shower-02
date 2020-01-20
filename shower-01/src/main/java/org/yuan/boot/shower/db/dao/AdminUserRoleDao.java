package org.yuan.boot.shower.db.dao;

import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.dao.BaseDao;
import org.yuan.boot.shower.db.pojo.AdminUserRole;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:12
 */
public interface AdminUserRoleDao extends BaseDao<AdminUserRole> {
    List<AdminUserRole> selectByUserId(Long id);

    List<Long> selectRoleIdsByUserId(Long id);

    void batchSaveByUser(List<AdminUserRole> adminUserRoles);

    void deleteByUserIds(List<AdminUserRole> adminUserRoles);

    void batchSaveByRole(List<AdminUserRole> adminUserRoles);

    void batchSave(List<AdminUserRole> adminUserRoles);

    @Transactional(rollbackFor = Exception.class)
    void deleteByRoleIds(List<AdminUserRole> adminUserRoles);
}
