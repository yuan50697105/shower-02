package org.yuan.boot.shower.db.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.commons.pojo.BaseEntity;
import org.yuan.boot.shower.db.dao.AdminRoleDao;
import org.yuan.boot.shower.db.mapper.AdminRoleMapper;
import org.yuan.boot.shower.db.pojo.AdminRole;
import org.yuan.boot.shower.db.pojo.AdminRoleCondition;
import org.yuan.boot.shower.db.pojo.AdminRoleExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:10
 */
@Component
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class AdminRoleDaoImpl extends BaseDaoImpl<AdminRole, AdminRoleMapper> implements AdminRoleDao {
    @Override
    public List<AdminRole> selectByRoleIds(List<Long> roleIds) {
        roleIds = new ArrayList<>(new HashSet<>(roleIds));
        AdminRoleExample example = new AdminRoleExample();
        example.or().andIdIn(roleIds);
        return baseMapper().selectByExample(example);
    }


    @Override
    public List<Long> selectRoleIdsByRoleIds(List<Long> roleIds) {
        List<AdminRole> adminRoles = selectByRoleIds(roleIds);
        return adminRoles.stream().map(BaseEntity::getId).collect(Collectors.toList());
    }

    @Override
    public PageInfo<AdminRole> selectPage(AdminRoleCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return PageInfo.of(baseMapper().selectByCondition(condition));
    }

    @Override
    public List<AdminRole> selectList(AdminRoleCondition condition) {
        return baseMapper().selectByCondition(condition);
    }

    @Override
    public Optional<AdminRole> getById(Long id) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(AdminRole adminRole) {
        baseMapper().insertSelective(adminRole);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateById(AdminRole adminRole) {
        baseMapper().updateByPrimaryKeySelective(adminRole);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        baseMapper().deleteByPrimaryKey(id);
    }

}