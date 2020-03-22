package com.idea.shower.app.db.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.dao.AdminPermissionDao;
import com.idea.shower.app.db.module.mapper.AdminPermissionMapper;
import com.idea.shower.app.db.module.pojo.AdminPermission;
import com.idea.shower.app.db.module.pojo.query.AdminPermissionQuery;
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
 * @create: 2020-02-08 16:19
 */
@Component
@AllArgsConstructor
public class AdminPermissionDaoImpl extends BaseDaoImpl<AdminPermission, AdminPermissionMapper> implements AdminPermissionDao {
    @Override
    public PageResult<AdminPermission> selectPageByCondition(AdminPermissionQuery condition) {
        PageHelper.startPage(condition.getPageNum(), condition.getPageSize());
        return new PageResult<>(PageInfo.of(baseMapper().selectByCondition(condition)));
    }

    @Override
    public List<AdminPermission> selectListByCondition(AdminPermissionQuery condition) {
        return baseMapper().selectByCondition(condition);
    }

    @Override
    public List<AdminPermission> selectByIds(List<Long> ids) {
        return baseMapper().selectByIdIn(ids);
    }

    @Override
    public List<Long> selectIdByIds(List<Long> permissionIds) {
        return baseMapper().selectIdByIdIn(permissionIds);
    }

    @Override
    public Optional<AdminPermission> selectById(Long id) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertSelective(AdminPermission adminPermission) {
        return baseMapper().insertSelective(adminPermission);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateSelective(AdminPermission adminPermission) {
        return baseMapper().updateByPrimaryKeySelective(adminPermission);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteById(Long id) {
        return baseMapper().deleteByPrimaryKey(id);
    }
}