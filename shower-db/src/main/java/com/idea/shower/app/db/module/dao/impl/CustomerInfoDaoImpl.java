package com.idea.shower.app.db.module.dao.impl;

import com.idea.shower.app.db.module.mapper.CustomerInfoMapper;
import com.idea.shower.app.db.module.pojo.CustomerInfoExample;
import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.dao.CustomerInfoDao;
import com.idea.shower.app.db.module.pojo.CustomerInfo;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

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

    @Override
    public Optional<CustomerInfo> getById(Long id) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    public Optional<CustomerInfo> getByUnionId(String unionId) {
        CustomerInfoExample example = new CustomerInfoExample();
        example.or().andUnionIdEqualTo(unionId);
        return Optional.ofNullable(baseMapper().selectByExample(example).get(0));
    }


    @Override
    public boolean existByUnionIdAndOpenId(String unionid, String openid) {
        return countByUnionIdAndOpenId(unionid, openid) > 0;
    }

    @Override
    public long countByUnionIdAndOpenId(String unionid, String openid) {
        CustomerInfoExample example = new CustomerInfoExample();
        example.or().andUnionIdEqualTo(unionid);
        return baseMapper().countByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(CustomerInfo customerInfo) {
        baseMapper().insertSelective(customerInfo);
    }

    @Override
    public void updateById(CustomerInfo customerInfo) {
        baseMapper().updateByPrimaryKeySelective(customerInfo);
    }

}