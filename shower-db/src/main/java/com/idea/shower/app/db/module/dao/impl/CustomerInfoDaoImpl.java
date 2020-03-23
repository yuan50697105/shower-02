package com.idea.shower.app.db.module.dao.impl;


import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.dao.CustomerInfoDao;
import com.idea.shower.app.db.module.mapper.CustomerInfoMapper;
import com.idea.shower.app.db.module.pojo.CustomerInfo;
import com.idea.shower.app.db.module.pojo.CustomerInfoExample;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 12:43
 */
@Component
@AllArgsConstructor
public class CustomerInfoDaoImpl extends BaseDaoImpl<CustomerInfo, CustomerInfoMapper> implements CustomerInfoDao {
    @Override
    public List<CustomerInfo> selectByUnionId(String unionId) {
        CustomerInfoExample example = new CustomerInfoExample();
        example.or().andUnionIdEqualTo(unionId);
        return baseMapper().selectByExample(example);
    }

    @Override
    public Optional<CustomerInfo> getByUnionId(String unionId) {
        return Optional.ofNullable(baseMapper().selectOneByUnionId(unionId));
    }

    @Override
    public Optional<CustomerInfo> getById(String id) {
        return Optional.ofNullable(baseMapper().selectOneById(id));
    }

    @Override
    public long countByUnionId(String unionId) {
        CustomerInfoExample example = new CustomerInfoExample();
        example.or().andUnionIdEqualTo(unionId);
        return baseMapper().countByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int save(CustomerInfo customerInfo) {
        return baseMapper().insertSelective(customerInfo);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(CustomerInfo customerInfo) {
        return baseMapper().updateByPrimaryKeySelective(customerInfo);
    }

    @Override
    public Optional<CustomerInfo> getByOpenId(String openId) {
        return Optional.ofNullable(baseMapper().selectOneByOpenId(openId));
    }
    @Override
    public long countByOpenId(String openid) {
        CustomerInfoExample example = new CustomerInfoExample();
        example.or().andOpenIdEqualTo(openid);
        return baseMapper().countByExample(example);
    }
}