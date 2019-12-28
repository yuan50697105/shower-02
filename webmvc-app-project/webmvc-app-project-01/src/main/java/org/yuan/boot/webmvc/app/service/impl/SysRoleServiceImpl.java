package org.yuan.boot.webmvc.app.service.impl;

import cn.hutool.core.lang.Snowflake;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuan.boot.webmvc.app.mapper.SysRoleMapper;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.condition.SysRoleCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysRoleConverter;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;
import org.yuan.boot.webmvc.app.service.SysRoleService;
import org.yuan.boot.webmvc.db.service.impl.BaseServiceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-28 12:20
 */
@Service
public class SysRoleServiceImpl extends BaseServiceImpl<SysRole, SysRoleMapper> implements SysRoleService {
    @Autowired
    private SysRoleConverter sysRoleConverter;
    @Autowired
    private Snowflake snowflake;

    @Override
    public PageInfo<SysRole> selectPage(SysRoleCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return PageInfo.of(baseMapper().selectByCondition(condition));
    }

    @Override
    public List<SysRole> selectList(SysRoleCondition condition) {
        return baseMapper().selectByCondition(condition);
    }

    @Override
    public Optional<SysRole> selectOne(SysRole sysRole) {
        return baseMapper().selectOne(sysRole);
    }

    @Override
    public Optional<SysRole> selectById(Long id) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    public void saveVo(SysRoleVo sysRoleVo) {
        SysRole sysRole = sysRoleConverter.convert(sysRoleVo).setId(snowflake.nextId()).setCreateTime(new Date());
        baseMapper().insertSelective(sysRole);
    }
}