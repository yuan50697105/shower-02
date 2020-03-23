package com.idea.shower.app.db.module.dao;


import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.PriceInfo;

import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 20:18
 */
public interface PriceInfoDao extends BaseDao<PriceInfo> {
    Optional<PriceInfo> getFromTheirPricesByRangeCode(String rangeCode);

    Optional<PriceInfo> getRenewalPriceByRangeCode(String rangeCode);
}
