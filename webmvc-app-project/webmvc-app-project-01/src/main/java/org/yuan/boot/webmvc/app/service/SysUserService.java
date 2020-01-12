package org.yuan.boot.webmvc.app.service;

import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:57
 */
public interface SysUserService {
    Result selectPage(SysUserCondition condition);

    Result selectList(SysUserCondition condition);

    Result selectOne(SysUser condition);

    Result selectById(Long id);

    Result save(SysUserVo sysUserVo);

    Result update(SysUserVo sysUserVo);

    Result updatePwd(SysUserVo sysUserVo);

    Result updateRole(SysUserVo sysUserVo);

    Result delete(List<Long> ids);

    Result delete(Long id);
}
