package org.yuan.boot.shower.db.dao;

import org.yuan.boot.shower.commons.dao.BaseDao;
import org.yuan.boot.shower.db.pojo.CustomerInfo;

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
