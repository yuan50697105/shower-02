package com.idea.shower.app.db.module.dao.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.dao.AdminUserDao;
import com.idea.shower.app.db.module.mapper.AdminUserMapper;
import com.idea.shower.app.db.module.pojo.AdminUser;
import com.idea.shower.app.db.module.pojo.AdminUserExample;
import com.idea.shower.app.db.module.pojo.query.AdminUserQuery;
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
 * @create: 2020-02-08 16:21
 */
@Component
@AllArgsConstructor
public class AdminUserDaoImpl extends BaseDaoImpl<AdminUser, AdminUserMapper> implements AdminUserDao {

    @Override
    public PageResult<AdminUser> selectPageByCondition(AdminUserQuery condition) {
        PageHelper.startPage(condition.getPageNum(), condition.getPageSize());
        return pageResult(PageInfo.of(baseMapper().selectByCondition(condition)));
    }

    @Override
    public List<AdminUser> selectListByCondition(AdminUserQuery condition) {
        return baseMapper().selectByCondition(condition);
    }

    @Override
    public Optional<AdminUser> selectById(Long id) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    public AdminUser getById(Long id) {
        return baseMapper().selectByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertSelective(AdminUser adminUser) {
        return baseMapper().insertSelective(adminUser);
    }

    @Override
    public int updateSelective(AdminUser adminUser) {
        return baseMapper().updateByPrimaryKeySelective(adminUser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteById(Long id) {
        return baseMapper().deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByIds(List<Long> ids) {
        AdminUserExample example = new AdminUserExample();
        example.or().andIdIn(ids);
        return baseMapper().deleteByExample(example);
    }

}