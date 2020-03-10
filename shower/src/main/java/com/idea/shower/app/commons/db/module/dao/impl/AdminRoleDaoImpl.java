package com.idea.shower.app.commons.db.module.dao.impl;

import com.idea.shower.app.commons.db.commons.dao.impl.BaseDaoImpl;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.idea.shower.app.commons.db.module.dao.AdminRoleDao;
import com.idea.shower.app.commons.db.module.mapper.AdminRoleMapper;
import com.idea.shower.app.commons.db.module.pojo.AdminRole;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:29
 */
@Component
@AllArgsConstructor
@Log4j2
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class AdminRoleDaoImpl extends BaseDaoImpl<AdminRole, AdminRoleMapper> implements AdminRoleDao {
}