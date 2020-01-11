package org.yuan.boot.webmvc.app.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.webmvc.app.dao.SysUserDao;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysUserConverter;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.app.service.SysUserService;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:57
 */
@AllArgsConstructor
@Service
public class SysUserServiceImpl implements SysUserService {
    private SysUserDao sysUserDao;
    private SysUserConverter sysUserConverter;
    @Override
    public Result page(SysUserCondition condition) {
        return sysUserDao.page(condition);
    }

    @Override
    public Result list(SysUserCondition condition) {
        return sysUserDao.list(condition);
    }

    @Override
    public Result get(SysUser condition) {
        return sysUserDao.get(condition);
    }

    @Override
    public Result save(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convert(sysUserVo);
        return sysUserDao.save(sysUser);
    }
}