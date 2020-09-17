package com.idea.shower.db.mybaits.module.dao;


import com.idea.shower.db.mybaits.commons.dao.CommonsDao;
import com.idea.shower.db.mybaits.module.pojo.PriceInfo;

import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 20:18
 */
<<<<<<< HEAD
public interface PriceInfoDao extends CommonsDao<PriceInfo,PriceInfo> {
=======
public interface PriceInfoDao extends BaseDao<PriceInfo> {
    void insert(PriceInfo priceInfo);
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92

    Optional<PriceInfo> getStartingPricesPriceCodeOpt(String rangeCode);

    Optional<PriceInfo> getRenewalPriceByPriceCodeOpt(String rangeCode);
}
