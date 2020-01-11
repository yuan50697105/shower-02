package org.yuan.boot.webmvc.app.dao;

import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.exception.NoValidateResultRuntimeException;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:31
 */
public interface SysUserDao extends BaseDao<SysUser> {
    PageResult<SysUser> page(SysUserCondition condition);

    List<SysUser> list(SysUserCondition condition);

    Optional<SysUser> get(SysUser condition) throws NoValidateResultRuntimeException;

    void save(SysUser sysUserVo);

    void update(SysUser sysUser);

    Optional<SysUser> selectByUsername(String username);

    void delete(List<Long> ids);

    void delete(Long id);
}
