package com.idea.shower.shower.app.db.dao;

import com.idea.shower.shower.app.commons.dao.BaseDao;
import com.idea.shower.shower.app.db.pojo.GoodsInfo;

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
