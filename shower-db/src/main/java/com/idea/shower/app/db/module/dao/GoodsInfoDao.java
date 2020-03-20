package com.idea.shower.app.db.module.dao;


import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.GoodsInfo;

import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 20:18
 */
public interface GoodsInfoDao extends BaseDao<GoodsInfo> {
    Optional<GoodsInfo> getFromTheirPricesByRangeCode(String rangeCode);

    Optional<GoodsInfo> getRenewalPriceByRangeCode(String rangeCode);
}
