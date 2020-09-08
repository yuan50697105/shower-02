package com.idea.shower.db.mybaits.module.dao;


import com.idea.shower.db.mybaits.commons.dao.BaseDao;
import com.idea.shower.db.mybaits.module.pojo.PriceInfo;

import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 20:18
 */
public interface PriceInfoDao extends BaseDao<PriceInfo> {
    void save(PriceInfo priceInfo);

    Optional<PriceInfo> getStartingPricesPriceCode(String rangeCode);

    Optional<PriceInfo> getRenewalPriceByPriceCode(String rangeCode);
}