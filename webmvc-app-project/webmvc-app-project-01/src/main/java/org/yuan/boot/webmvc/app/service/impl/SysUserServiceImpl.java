package org.yuan.boot.webmvc.app.service.impl;

import cn.hutool.core.thread.ThreadUtil;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.webmvc.app.dao.SysRoleDao;
import org.yuan.boot.webmvc.app.dao.SysUserDao;
import org.yuan.boot.webmvc.app.dao.SysUserRoleDao;
import org.yuan.boot.webmvc.app.exception.ExistResultRuntimeException;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysUserConverter;
import org.yuan.boot.webmvc.app.pojo.converter.SysUserRoleConverter;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.app.service.SysUserService;
import org.yuan.boot.webmvc.app.utils.ResultConstants;
import org.yuan.boot.webmvc.app.utils.ResultUtils;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:57
 */
@AllArgsConstructor
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class SysUserServiceImpl implements SysUserService {
    private SysUserConverter sysUserConverter;
    private SysUserRoleConverter sysUserRoleConverter;
    private SysUserDao sysUserDao;
    private PasswordEncoder passwordEncoder;
    private SysUserRoleDao sysUserRoleDao;
    private SysRoleDao sysRoleDao;

    @Override
    public Result selectPage(SysUserCondition condition) {
        return Result.data(sysUserDao.selectPage(condition));
    }

    @Override
    public Result selectList(SysUserCondition condition) {
        return Result.data(sysUserDao.selectList(condition));
    }

    @Override
    public Result selectOne(SysUser condition) {
        return Result.data(sysUserDao.selectOne(condition));
    }

    @Override
    public Result selectById(Long id) {
        return Result.data(sysRoleDao.selectById(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result save(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convertForSave(sysUserVo);
        Optional<SysUser> optional = sysUserDao.selectByUsername(sysUser.getUsername());
        if (optional.isPresent()) {
            throw new ExistResultRuntimeException(ResultUtils.existError("username已存在"));
        }
        sysUserDao.save(sysUser);
        ThreadUtil.execAsync(() -> {
            List<Long> roleIds = sysRoleDao.selectByIds(sysUserVo.getRoleIds());
            sysUserRoleDao.batchSave(sysUserRoleConverter.convert(sysUser.getId(), roleIds));
        });
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result update(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convertForUpdate(sysUserVo);
        sysUserDao.update(sysUser);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result updatePwd(SysUserVo sysUserVo) {
        Result result;
        Optional<SysUser> optional = sysUserDao.selectByUsername(sysUserVo.getUsername());
        if (!optional.isPresent()) {
            result = Result.error(ResultConstants.CHANGE_PASSWORD_USER_NOT_HAD, "用户不存在");
        } else {
            SysUser sysUser = optional.get();
            String password = sysUser.getPassword();
            String oldPwd = sysUserVo.getOldPwd();
            String newPwd = sysUserVo.getNewPwd();
            if (passwordEncoder.matches(oldPwd, password)) {
                sysUser.setPassword(passwordEncoder.encode(newPwd));
                sysUserDao.update(sysUser);
                result = Result.ok();
            } else {
                result = Result.error(ResultConstants.CHANGE_PASSWORD_USER_OLD_PWD_ERROR, "密码不正确");
            }
        }
        return result;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result updateRole(SysUserVo sysUserVo) {
        Long userId = sysUserVo.getId();
        List<Long> roleIds = sysUserVo.getRoleIds();
        roleIds = sysRoleDao.selectByIds(roleIds);
        sysUserRoleDao.batchUpdate(new SysUser().setId(userId), sysUserRoleConverter.convert(userId, roleIds));
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result delete(List<Long> ids) {
        sysUserDao.delete(ids);
        sysUserRoleDao.deleteByUserIds(ids);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result delete(Long id) {
        sysUserDao.delete(id);
        sysUserRoleDao.deleteByUserId(id);
        return Result.ok();
    }
}