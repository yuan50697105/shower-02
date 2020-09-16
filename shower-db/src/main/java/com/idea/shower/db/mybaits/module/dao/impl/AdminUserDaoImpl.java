package com.idea.shower.db.mybaits.module.dao.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.dao.AdminUserDao;
import com.idea.shower.db.mybaits.module.mapper.AdminUserMapper;
import com.idea.shower.db.mybaits.module.pojo.AdminUser;
import com.idea.shower.db.mybaits.module.pojo.AdminUserExample;
import com.idea.shower.db.mybaits.module.pojo.query.AdminUserQuery;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 16:21
 */
@Component
@AllArgsConstructor
public class AdminUserDaoImpl extends CommonsDaoImpl<AdminUser, AdminUserMapper> implements AdminUserDao {

    @org.springframework.beans.factory.annotation.Autowired
    private final AdminUserMapper adminUserMapper;

    @Override
    public PageResult<AdminUser> selectPageByCondition(AdminUserQuery condition) {
        PageHelper.startPage(condition.getPage(), condition.getLimit());
        return pageResult(PageInfo.of(baseDao().selectByCondition(condition)));
    }

    @Override
    public List<AdminUser> selectListByCondition(AdminUserQuery condition) {
        return baseDao().selectByCondition(condition);
    }

    @Override
    public Optional<AdminUser> selectByIdOpt(Long id) {
        return Optional.ofNullable(baseDao().selectByPrimaryKey(id));
    }

    @Override
    public AdminUser getById(Long id) {
        return baseDao().selectByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertSelective(AdminUser adminUser) {
        return baseDao().insertSelective(adminUser);
    }

    @Override
    public int updateSelective(AdminUser adminUser) {
        return baseDao().updateByPrimaryKeySelective(adminUser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteById(Long id) {
        return baseDao().deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByIds(List<Long> ids) {
        AdminUserExample example = new AdminUserExample();
        example.or().andIdIn(ids);
        return baseDao().deleteByExample(example);
    }

    @Override
    public AdminUser selectByUsername(String username) {
        return baseDao().selectOneByUsername(username);
    }

    @Override
    public Optional<AdminUser> selectByUsernameOpt(String username) {
        return Optional.ofNullable(selectByUsername(username));
    }

    @Override
    public PageResult<AdminUser> selectPageByQuery(AdminUserQuery query, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageResult<>(new PageInfo<>(baseDao().selectByCondition(query)));
    }

    @Override
    public List<AdminUser> selectListByQuery(AdminUserQuery query) {
        return baseDao().selectByCondition(query);
    }

    @Override
    public boolean existByUsername(String username) {
        AdminUserExample example = new AdminUserExample();
        example.or().andUsernameEqualTo(username);
        return baseDao().countByExample(example) > 0;
    }

	@Override
	public Long selectOneIdByUsername(String username){
		 return adminUserMapper.selectOneIdByUsername(username);
	}


    @Override
    public QueryWrapper<AdminUser> getWrapper(Map<String, Object> params) {
        return null;
    }
}