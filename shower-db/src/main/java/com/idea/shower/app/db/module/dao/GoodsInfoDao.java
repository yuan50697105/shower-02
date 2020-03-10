package com.idea.shower.app.db.module.dao;


import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.GoodsInfo;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:05
 */
public interface GoodsInfoDao extends BaseDao<GoodsInfo> {
    GoodsInfo getRentalGoodsInfoByRangeCode(String rangeCode);

    GoodsInfo getContinueGoodsInfoByRangeCode(String rangeCode);
}
