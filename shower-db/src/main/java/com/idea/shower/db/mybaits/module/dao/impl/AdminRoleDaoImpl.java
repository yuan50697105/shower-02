package com.idea.shower.db.mybaits.module.dao.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.dao.AdminRoleDao;
import com.idea.shower.db.mybaits.module.mapper.AdminRoleMapper;
import com.idea.shower.db.mybaits.module.pojo.AdminRole;
import com.idea.shower.db.mybaits.module.pojo.AdminRoleExample;
import com.idea.shower.db.mybaits.module.pojo.query.AdminRoleQuery;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 16:20
 */
@Component
@AllArgsConstructor
public class AdminRoleDaoImpl extends CommonsDaoImpl<AdminRole, AdminRoleMapper> implements AdminRoleDao {
    @Override
    public PageResult<AdminRole> selectPageByCondition(AdminRoleQuery condition) {
        PageHelper.startPage(condition.getPage(), condition.getLimit());
        return pageResult(PageInfo.of(baseDao().selectByCondition(condition)));
    }

    @Override
    public List<AdminRole> selectListByCondition(AdminRoleQuery condition) {
        return baseDao().selectByCondition(condition);
    }

    @Override
    public AdminRole getById(Long id) {
        return baseDao().selectByPrimaryKey(id);
    }

    @Override
    public List<Long> selectIdByIdIn(List<Long> roleIds) {
        return baseDao().selectIdByIdIn(roleIds);
    }

    @Override
    public List<AdminRole> selectByIds(List<Long> roleIds) {
        return baseDao().selectByIdIn(roleIds);
    }

    @Override
    public Optional<AdminRole> selectByIdOpt(Long id) {
        return Optional.ofNullable(baseDao().selectByPrimaryKey(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertSelective(AdminRole adminRole) {
        return baseDao().insertSelective(adminRole);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateSelective(AdminRole adminRole) {
        return baseDao().updateByPrimaryKeySelective(adminRole);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteById(Long id) {
        return baseDao().deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public void deleteByIds(List<Long> id) {
        AdminRoleExample example = new AdminRoleExample();
        example.or().andIdIn(id);
        baseDao().deleteByExample(example);
    }

    @Override
    public PageResult<AdminRole> selectPageByQuery(AdminRoleQuery query, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageResult<>(new PageInfo<>(baseDao().selectByCondition(query)));
    }

    @Override
    public List<AdminRole> selectListByQuery(AdminRoleQuery query) {
        return baseDao().selectByCondition(query);
    }

    @Override
    public boolean checkExistByName(String name) {
        AdminRoleExample example = new AdminRoleExample();
        example.or().andNameEqualTo(name);
        long count = baseDao().countByExample(example);
        return count > 0;
    }

    @Override
    public List<AdminRole> listByIds(List<Long> roleIds) {
        return selectByIds(roleIds);
    }

    @Override
    public List<String> selectNameByIds(List<Long> roleIds) {
        AdminRoleExample example = new AdminRoleExample();
        example.or().andIdIn(roleIds);
        List<AdminRole> adminRoles = baseDao().selectByExample(example);
        return adminRoles.stream().map(AdminRole::getName).collect(Collectors.toList());
    }

    @Override
    public QueryWrapper<AdminRole> getWrapper(Map<String, Object> params) {
        return null;
    }
}