package org.yuan.boot.webmvc.app.service;

import org.yuan.boot.db.service.BaseDbService;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.exception.NoValidateResultRuntimeException;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:31
 */
public interface SysUserService extends BaseDbService<SysUser, Long> {
    Result page(SysUserCondition condition);

    Result list(SysUserCondition condition);

    Result get(SysUser condition) throws NoValidateResultRuntimeException;

    Result save(SysUserVo sysUserVo);
}
