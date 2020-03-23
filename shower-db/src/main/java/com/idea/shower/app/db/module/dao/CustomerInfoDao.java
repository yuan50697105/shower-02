package com.idea.shower.app.db.module.dao;


import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.CustomerInfo;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 12:42
 */
public interface CustomerInfoDao extends BaseDao<CustomerInfo> {
    /**
     * 通过UnionId获取用户信息
     *
     * @param unionId unionId
     * @return 用户信息
     */
    List<CustomerInfo> selectByUnionId(String unionId);

    /**
     * 通过UnionId获取用户信息
     *
     * @param unionId unionId
     * @return 用户信息
     */
    Optional<CustomerInfo> getByUnionId(String unionId);

    /**
     * 保存
     *
     * @param customerInfo 用户信息
     * @return 受影响行数
     */
    int save(CustomerInfo customerInfo);

    /**
     * 更新
     *
     * @param customerInfo 用户新
     * @return 受影响行数
     */
    int update(CustomerInfo customerInfo);

    /**
     * 通过id获取用户信息
     *
     * @param id id
     * @return 用户信息
     */
    Optional<CustomerInfo> getById(String id);

    /**
     * 通过openId获取用户信息
     *
     * @param openId openId
     * @return 用户信息
     */
    Optional<CustomerInfo> getByOpenId(String openId);
    /**
     * 通过openid统计数量
     *
     * @param openid openid
     * @return 数量
     */
    long countByOpenId(String openid);

    /**
     * 通过UnionId统计数量
     *
     * @param unionId unionId
     * @return 数量
     */
    long countByUnionId(String unionId);
}
