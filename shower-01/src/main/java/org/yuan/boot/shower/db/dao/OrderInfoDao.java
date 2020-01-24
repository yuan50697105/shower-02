package org.yuan.boot.shower.db.dao;

import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.shower.commons.dao.BaseDao;
import org.yuan.boot.shower.db.pojo.OrderInfo;
import org.yuan.boot.shower.db.pojo.OrderInfoCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:34
 */
public interface OrderInfoDao extends BaseDao<OrderInfo> {
    PageResult<OrderInfo> selectPage(OrderInfoCondition condition);

    void save(OrderInfo orderInfo);
}
