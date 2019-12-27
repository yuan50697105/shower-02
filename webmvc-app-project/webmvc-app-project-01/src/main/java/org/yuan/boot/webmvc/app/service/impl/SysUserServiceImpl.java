package org.yuan.boot.webmvc.app.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.webmvc.app.mapper.SysUserMapper;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysUserConverter;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.app.service.SysUserService;
import org.yuan.boot.webmvc.db.service.impl.BaseServiceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author yuane
 */
@SuppressWarnings("ALL")
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser, SysUserMapper> implements SysUserService {
    @Autowired
    private SysUserConverter sysUserConverter;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convert(sysUserVo).setCreateTime(new Date());
        baseMapper().insert(sysUser);
    }

    @Override
    public void modify(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convert(sysUserVo).setUpdateTime(new Date());
        baseMapper().updateByPrimaryKeySelective(sysUser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        baseMapper().deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<SysUser> selectPage(SysUserCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return new PageInfo<>(baseMapper().selectByCondition(condition));
    }

    @Override
    public List<SysUser> selectList(SysUserCondition condition) {
        return baseMapper().selectByCondition(condition);
    }

    @Override
    public Optional<SysUser> selectOne(SysUser sysUser) {
        return baseMapper().selectOne(sysUser);
    }

    @Override
    public Optional<SysUser> selectById(Long id) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(id));
    }
}
