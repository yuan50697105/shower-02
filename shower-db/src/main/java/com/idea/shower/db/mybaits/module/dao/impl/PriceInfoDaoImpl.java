package com.idea.shower.db.mybaits.module.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.constants.PriceInfoConstants;
import com.idea.shower.db.mybaits.module.dao.PriceInfoDao;
import com.idea.shower.db.mybaits.module.mapper.PriceInfoMapper;
import com.idea.shower.db.mybaits.module.pojo.PriceInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 20:18
 */
@Component
@AllArgsConstructor
public class PriceInfoDaoImpl extends CommonsDaoImpl<PriceInfo, PriceInfo, PriceInfoMapper> implements PriceInfoDao {


    @Override
    public Optional<PriceInfo> getStartingPricesPriceCodeOpt(String priceCode) {
        return Optional.ofNullable(baseDao().selectOneByPriceCodeAndType(priceCode, PriceInfoConstants.PriceType.STARTING_PRICE));
    }

    @Override
    public Optional<PriceInfo> getRenewalPriceByPriceCodeOpt(String priceCode) {
        return Optional.ofNullable(baseDao().selectOneByPriceCodeAndType(priceCode, PriceInfoConstants.PriceType.RENEWAL_PRICE));
    }

    @Override
    public QueryWrapper<PriceInfo> getWrapper(Map<String, Object> params) {
        return null;
    }
}