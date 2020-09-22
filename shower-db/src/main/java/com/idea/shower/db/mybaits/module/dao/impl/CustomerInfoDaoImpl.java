package com.idea.shower.db.mybaits.module.dao.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.dao.CustomerInfoDao;
import com.idea.shower.db.mybaits.module.mapper.CustomerInfoMapper;
import com.idea.shower.db.mybaits.module.pojo.CustomerInfo;
import com.idea.shower.db.mybaits.module.pojo.CustomerInfoExample;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 12:43
 */
@Component
@AllArgsConstructor
public class CustomerInfoDaoImpl extends CommonsDaoImpl<CustomerInfo, CustomerInfo, CustomerInfoMapper> implements CustomerInfoDao {
    @Override
    public QueryWrapper<CustomerInfo> getWrapper(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<CustomerInfo> selectByUnionId(String unionId) {
        CustomerInfoExample example = new CustomerInfoExample();
        example.or().andUnionIdEqualTo(unionId);
        return baseDao().selectByExample(example);
    }

    @Override
    public Optional<CustomerInfo> getByUnionIdOpt(String unionId) {
        return Optional.ofNullable(baseDao().selectOneByUnionId(unionId));
    }

    @Override
    public Optional<CustomerInfo> getByIdOpt(String id) {
        return Optional.ofNullable(baseDao().selectOneById(id));
    }

    @Override
    public long countByUnionId(String unionId) {
        CustomerInfoExample example = new CustomerInfoExample();
        example.or().andUnionIdEqualTo(unionId);
        return baseDao().countByExample(example);
    }


    @Override
    public Optional<CustomerInfo> getByOpenIdOpt(String openId) {
        return Optional.ofNullable(baseDao().selectOneByOpenId(openId));
    }

    @Override
    public long countByOpenId(String openid) {
        CustomerInfoExample example = new CustomerInfoExample();
        example.or().andOpenIdEqualTo(openid);
        return baseDao().countByExample(example);
    }
}