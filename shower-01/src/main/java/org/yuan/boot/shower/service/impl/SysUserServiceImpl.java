package org.yuan.boot.shower.service.impl;

import cn.hutool.core.thread.ThreadUtil;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.dao.SysRoleDao;
import org.yuan.boot.shower.dao.SysUserDao;
import org.yuan.boot.shower.dao.SysUserRoleDao;
import org.yuan.boot.shower.exception.ExistResultRuntimeException;
import org.yuan.boot.shower.pojo.SysUser;
import org.yuan.boot.shower.pojo.condition.SysUserCondition;
import org.yuan.boot.shower.pojo.converter.SysUserConverter;
import org.yuan.boot.shower.pojo.converter.SysUserRoleConverter;
import org.yuan.boot.shower.pojo.vo.SysUserVo;
import org.yuan.boot.shower.service.SysUserService;
import org.yuan.boot.shower.utils.Results;
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
        return Results.data(sysUserDao.selectPage(condition));
    }

    @Override
    public Result selectList(SysUserCondition condition) {
        return Results.data(sysUserDao.selectList(condition));
    }

    @Override
    public Result selectOne(SysUser condition) {
        return Results.data(sysUserDao.selectOne(condition));
    }

    @Override
    public Result selectById(Long id) {
        return Results.data(sysRoleDao.selectById(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result save(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convertForSave(sysUserVo);
        Optional<SysUser> optional = sysUserDao.selectByUsername(sysUser.getUsername());
        if (optional.isPresent()) {
            throw new ExistResultRuntimeException(Results.existError("username已存在"));
        }
        sysUserDao.save(sysUser);
        ThreadUtil.execAsync(() -> {
            List<Long> roleIds = sysRoleDao.selectByIds(sysUserVo.getRoleIds());
            sysUserRoleDao.batchSave(sysUserRoleConverter.convert(sysUser.getId(), roleIds));
        });
        return Results.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result update(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convertForUpdate(sysUserVo);
        sysUserDao.update(sysUser);
        return Results.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result updatePwd(SysUserVo sysUserVo) {
        Result result;
        Optional<SysUser> optional = sysUserDao.selectByUsername(sysUserVo.getUsername());
        if (!optional.isPresent()) {
            result = Results.error(Results.USER_ERROR, "用户不存在");
        } else {
            SysUser sysUser = optional.get();
            String password = sysUser.getPassword();
            String oldPwd = sysUserVo.getOldPwd();
            String newPwd = sysUserVo.getNewPwd();
            if (passwordEncoder.matches(oldPwd, password)) {
                sysUser.setPassword(passwordEncoder.encode(newPwd));
                sysUserDao.update(sysUser);
                result = Results.ok();
            } else {
                result = Results.error(Results.CHANGE_PASSWORD_USER_OLD_PWD_ERROR, "密码不正确");
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
        return Results.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result delete(List<Long> ids) {
        sysUserDao.delete(ids);
        sysUserRoleDao.deleteByUserIds(ids);
        return Results.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result delete(Long id) {
        sysUserDao.delete(id);
        sysUserRoleDao.deleteByUserId(id);
        return Results.ok();
    }
}