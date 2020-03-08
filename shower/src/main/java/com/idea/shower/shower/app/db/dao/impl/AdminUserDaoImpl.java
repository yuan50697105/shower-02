package com.idea.shower.shower.app.db.dao.impl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.idea.shower.db.mybaits.pojo.PageResult;
import com.idea.shower.shower.app.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.shower.app.db.dao.AdminUserDao;
import com.idea.shower.shower.app.db.mapper.AdminUserMapper;
import com.idea.shower.shower.app.db.pojo.AdminUser;
import com.idea.shower.shower.app.db.pojo.AdminUserQueryBaseConditionQuery;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 12:55
 */
@Component
@AllArgsConstructor
@Log4j2
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class AdminUserDaoImpl extends BaseDaoImpl<AdminUser, AdminUserMapper> implements AdminUserDao {
    @Override
    public PageResult<AdminUser> selectPage(AdminUserQueryBaseConditionQuery condition) {
        return pageResult(condition, baseMapper()::selectByCondition);
    }


}