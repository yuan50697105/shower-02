package org.yuan.boot.webmvc.app.dao;

import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfo;
import org.yuan.boot.webmvc.app.pojo.condition.BaseCustomerInfoCondition;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-05 19:40
 */
public interface BaseCustomerInfoDao extends BaseDao<BaseCustomerInfo> {
    PageResult<BaseCustomerInfo> selectPage(BaseCustomerInfoCondition condition);

    List<BaseCustomerInfo> selectList(BaseCustomerInfoCondition condition);

    Optional<BaseCustomerInfo> selectOne(BaseCustomerInfo customerInfo);

    Optional<BaseCustomerInfo> selectById(Long id);

    void save(BaseCustomerInfo customerInfo);

    void update(BaseCustomerInfo customerInfo);

    void delete(Long id);

    void delete(List<Long> ids);
}
