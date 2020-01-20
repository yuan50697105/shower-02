package org.yuan.boot.shower.db.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.db.dao.WxCustomerDao;
import org.yuan.boot.shower.db.mapper.WxCustomerMapper;
import org.yuan.boot.shower.db.pojo.WxCustomer;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:14
 */
@Component
@AllArgsConstructor
public class WxCustomerDaoImpl extends BaseDaoImpl<WxCustomer, WxCustomerMapper> implements WxCustomerDao {
}