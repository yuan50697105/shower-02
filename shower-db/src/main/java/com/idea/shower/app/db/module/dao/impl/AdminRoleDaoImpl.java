package com.idea.shower.app.db.module.dao.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.dao.AdminRoleDao;
import com.idea.shower.app.db.module.mapper.AdminRoleMapper;
import com.idea.shower.app.db.module.pojo.AdminRole;
import com.idea.shower.app.db.module.pojo.query.AdminRoleQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 16:20
 */
@Component
@AllArgsConstructor
public class AdminRoleDaoImpl extends BaseDaoImpl<AdminRole, AdminRoleMapper> implements AdminRoleDao {
    @Override
    public PageResult<AdminRole> selectPageByCondition(AdminRoleQuery condition) {
        PageHelper.startPage(condition.getPageNum(), condition.getPageSize());
        return pageResult(PageInfo.of(baseMapper().selectByCondition(condition)));
    }

    @Override
    public List<AdminRole> selectListByCondition(AdminRoleQuery condition) {
        return baseMapper().selectByCondition(condition);
    }

    @Override
    public AdminRole getById(Long id) {
        return baseMapper().selectByPrimaryKey(id);
    }

    @Override
    public List<Long> selectIdByIdIn(List<Long> roleIds) {
        return baseMapper().selectIdByIdIn(roleIds);
    }

    @Override
    public List<AdminRole> selectByIds(List<Long> roleIds) {
        return baseMapper().selectByIdIn(roleIds);
    }

    @Override
    public Optional<AdminRole> selectById(Long id) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertSelective(AdminRole adminRole) {
        return baseMapper().insertSelective(adminRole);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateSelective(AdminRole adminRole) {
        return baseMapper().updateByPrimaryKeySelective(adminRole);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteById(Long id) {
        return baseMapper().deleteByPrimaryKey(id);
    }
}