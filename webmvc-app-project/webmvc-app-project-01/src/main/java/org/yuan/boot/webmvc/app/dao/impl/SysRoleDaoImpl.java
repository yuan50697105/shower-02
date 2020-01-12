package org.yuan.boot.webmvc.app.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.webmvc.app.dao.SysRoleDao;
import org.yuan.boot.webmvc.app.mapper.SysRoleMapper;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.condition.SysRoleCondition;
import org.yuan.boot.webmvc.app.pojo.example.SysRoleExample;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-01 18:13
 */
@AllArgsConstructor
@Component
public class SysRoleDaoImpl extends BaseDaoImpl<SysRole, SysRoleMapper> implements SysRoleDao {

    @Override
    public PageResult<SysRole> page(SysRoleCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return new PageResult<>(PageInfo.of(baseMapper().selectByCondition(condition)));
    }

    @Override
    public List<SysRole> list(SysRoleCondition condition) {
        return baseMapper().selectByCondition(condition);
    }

    @Override
    public Optional<SysRole> get(SysRole sysRole) {
        return Optional.ofNullable(baseMapper().selectOne(sysRole));
    }

    @Override
    public Optional<SysRole> get(Long id) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(SysRole sysRole) {
        sysRole = sysRole.setId(snowflake().nextId()).setCreateTime(new Date());
        baseMapper().insertSelective(sysRole);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(SysRole sysRole) {
        sysRole = sysRole.setUpdateTime(new Date());
        baseMapper().updateByPrimaryKeySelective(sysRole);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        baseMapper().deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> ids) {
        SysRoleExample example = new SysRoleExample();
        example.createCriteria().andIdIn(ids);
        baseMapper().deleteByExample(example);
    }

    @Override
    public List<Long> selectByIds(List<Long> roleIds) {
        SysRoleExample example = new SysRoleExample();
        example.or().andIdIn(roleIds);
        List<SysRole> sysRoles = baseMapper().selectByExample(example);
        if (null != sysRoles) {
            return sysRoles.stream().map(SysRole::getId).collect(Collectors.toList());
        } else {
            return Collections.emptyList();
        }

    }

}