package com.idea.shower.db.mybaits.module.dao.impl;


import com.idea.shower.db.mybaits.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.db.mybaits.module.dao.AdminUserRoleDao;
import com.idea.shower.db.mybaits.module.mapper.AdminUserRoleMapper;
import com.idea.shower.db.mybaits.module.pojo.AdminUserRole;
import com.idea.shower.db.mybaits.module.pojo.AdminUserRoleExample;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 16:22
 */
@Component
@AllArgsConstructor
public class AdminUserRoleDaoImpl extends BaseDaoImpl<AdminUserRole, AdminUserRoleMapper> implements AdminUserRoleDao {
    @org.springframework.beans.factory.annotation.Autowired
    private final AdminUserRoleMapper adminUserRoleMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByUserId(Long userId) {
        return baseMapper().deleteByUserId(userId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByUserIds(List<Long> userIds) {
         baseMapper().deleteByUserIdIn(userIds);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByRoleId(Long roleId) {
        return baseMapper().deleteByRoleId(roleId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByRoleIds(List<Long> roleIds) {
         baseMapper().deleteByRoleIdIn(roleIds);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int batchInsertSelective(List<AdminUserRole> adminUserRoles) {
        return adminUserRoles.stream().map(baseMapper()::insertSelective).reduce(Integer::sum).orElse(0);
    }

    @Override
    public List<AdminUserRole> listByUserId(Long id) {
        AdminUserRoleExample example = new AdminUserRoleExample();
        example.or().andUserIdEqualTo(id);
        return baseMapper().selectByExample(example);
    }

    @Override
    public List<String> selectRoleNameByUsername(String username) {
        return baseMapper().selectRoleNameByUsername(username);
    }

    @Override
    public int insertSelective(AdminUserRole adminUserRole) {
        return adminUserRoleMapper.insertSelective(adminUserRole);
    }


    @Override
    public List<Long> selectRoleIdByUserId(Long userId) {
        return baseMapper().selectRoleIdByUserId(userId);
    }

    @Override
    public List<Long> selectUserIdByRoleId(Long roleId) {
        return baseMapper().selectUserIdByRoleId(roleId);
    }




}