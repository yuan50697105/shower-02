package org.yuan.boot.webmvc.app.dao;

import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.condition.SysRoleCondition;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-01 18:12
 */
public interface SysRoleDao extends BaseDao<SysRole> {
    PageResult<SysRole> selectPage(SysRoleCondition condition);

    List<SysRole> selectList(SysRoleCondition condition);

    Optional<SysRole> selectOne(SysRole sysRole);

    Optional<SysRole> selectById(Long id);

    void save(SysRole sysRole);

    void update(SysRole sysRole);

    void delete(Long id);

    void delete(List<Long> ids);

    List<Long> selectByIds(List<Long> roleIds);

    Optional<SysRole> selectByName(String name);
}
