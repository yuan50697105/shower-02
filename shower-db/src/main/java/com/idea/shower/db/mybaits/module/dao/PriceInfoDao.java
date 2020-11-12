package com.idea.shower.db.mybaits.module.dao;


import com.idea.shower.db.mybaits.commons.dao.CommonsDao;
import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import com.idea.shower.db.mybaits.module.pojo.PriceInfo;
import com.idea.shower.db.mybaits.module.pojo.ao.PriceInfoAo;
import com.idea.shower.db.mybaits.module.pojo.query.PriceInfoQuery;

import java.util.List;
import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 20:18
 */
public interface PriceInfoDao extends CommonsDao<PriceInfo,PriceInfo> {

    Optional<PriceInfo> getStartingPricesPriceCodeOpt(String rangeCode);

    Optional<PriceInfo> getRenewalPriceByPriceCodeOpt(String rangeCode);

    PageResult<PriceInfo> selectPageByQuery(PriceInfoQuery query);

    List<PriceInfoAo> selectListByQuery(PriceInfoQuery query);
}
