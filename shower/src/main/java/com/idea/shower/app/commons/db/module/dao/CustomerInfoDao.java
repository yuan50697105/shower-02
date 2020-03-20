package com.idea.shower.app.commons.db.module.dao;

import com.idea.shower.app.commons.db.commons.dao.BaseDao;
import com.idea.shower.app.commons.db.module.pojo.CustomerInfo;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:27
 */
public interface CustomerInfoDao extends BaseDao<CustomerInfo> {
    Optional<CustomerInfo> getById(Long id);

    Optional<CustomerInfo> getByUnionId(String unionId);

    boolean existByUnionIdAndOpenId(String unionid, String openid);

    long countByUnionIdAndOpenId(String unionid, String openid);

    void save(CustomerInfo customerInfo);

    void updateById(CustomerInfo customerInfo);
}
