package org.yuan.boot.shower.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.dao.BaseCustomerConsumeRecordDao;
import org.yuan.boot.shower.mapper.BaseCustomerConsumeRecordMapper;
import org.yuan.boot.shower.pojo.BaseCustomerConsumeRecord;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-19 21:22
 */
@Component
@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
public class BaseCustomerConsumeRecordDaoImpl extends BaseDaoImpl<BaseCustomerConsumeRecord, BaseCustomerConsumeRecordMapper> implements BaseCustomerConsumeRecordDao {
}