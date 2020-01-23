package org.yuan.boot.shower.db.dao.impl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.db.dao.CustomerInfoDao;
import org.yuan.boot.shower.db.mapper.CustomerInfoMapper;
import org.yuan.boot.shower.db.pojo.CustomerInfo;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:28
 */
@Component
@AllArgsConstructor
@Log4j2
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class CustomerInfoDaoImpl extends BaseDaoImpl<CustomerInfo, CustomerInfoMapper> implements CustomerInfoDao {

}