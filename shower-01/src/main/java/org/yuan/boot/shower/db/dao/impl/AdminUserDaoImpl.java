package org.yuan.boot.shower.db.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.db.dao.AdminUserDao;
import org.yuan.boot.shower.db.mapper.AdminUserMapper;
import org.yuan.boot.shower.db.pojo.AdminUser;
import org.yuan.boot.shower.db.pojo.AdminUserCondition;
import org.yuan.boot.shower.db.pojo.AdminUserExample;

import java.util.List;
import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:10
 */
@Component
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class AdminUserDaoImpl extends BaseDaoImpl<AdminUser, AdminUserMapper> implements AdminUserDao {
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(AdminUser adminUser) {
        baseMapper().insertSelective(adminUser);
    }

    @Override
    public PageInfo<AdminUser> selectPage(AdminUserCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return PageInfo.of(baseMapper().selectByCondtion(condition));
    }

    @Override
    public List<AdminUser> selectList(AdminUserCondition condition) {
        return baseMapper().selectByCondtion(condition);
    }

    @Override
    public AdminUser getById(Long id) {
        return baseMapper().selectByPrimaryKey(id);
    }

    @Override
    public AdminUser getByUsername(String username) {
        AdminUserExample example = new AdminUserExample();
        example.or().andUsernameEqualTo(username);
        return Optional.ofNullable(baseMapper().selectByExample(example).get(0)).orElse(new AdminUser());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateById(AdminUser adminUser) {
        baseMapper().updateByPrimaryKeySelective(adminUser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        baseMapper().deleteByPrimaryKey(id);
    }

    @Override
    public void delete(List<Long> ids) {
        AdminUserExample example = new AdminUserExample();
        example.or().andIdIn(ids);
        baseMapper().deleteByExample(example);
    }


}