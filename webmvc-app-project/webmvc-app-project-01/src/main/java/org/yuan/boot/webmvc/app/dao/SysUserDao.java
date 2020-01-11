package org.yuan.boot.webmvc.app.dao;

import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.exception.NoValidateResultRuntimeException;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:31
 */
public interface SysUserDao extends BaseDao<SysUser> {
    Result page(SysUserCondition condition);

    Result list(SysUserCondition condition);

    Result get(SysUser condition) throws NoValidateResultRuntimeException;

    Result save(SysUser sysUserVo);
}
