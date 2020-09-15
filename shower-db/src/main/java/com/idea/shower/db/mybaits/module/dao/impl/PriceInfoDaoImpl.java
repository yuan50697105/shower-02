package com.idea.shower.db.mybaits.module.dao.impl;

import com.idea.shower.db.mybaits.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.db.mybaits.module.constants.PriceInfoConstants;
import com.idea.shower.db.mybaits.module.dao.PriceInfoDao;
import com.idea.shower.db.mybaits.module.mapper.PriceInfoMapper;
import com.idea.shower.db.mybaits.module.pojo.PriceInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 20:18
 */
@Component
@AllArgsConstructor
public class PriceInfoDaoImpl extends BaseDaoImpl<PriceInfo, PriceInfoMapper> implements PriceInfoDao {
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(PriceInfo priceInfo) {
        baseMapper().insert(priceInfo);
    }

    @Override
    public Optional<PriceInfo> getStartingPricesPriceCodeOpt(String priceCode) {
        return Optional.ofNullable(baseMapper().selectOneByPriceCodeAndType(priceCode, PriceInfoConstants.PriceType.STARTING_PRICE));
    }

    @Override
    public Optional<PriceInfo> getRenewalPriceByPriceCodeOpt(String priceCode) {
        return Optional.ofNullable(baseMapper().selectOneByPriceCodeAndType(priceCode, PriceInfoConstants.PriceType.RENEWAL_PRICE));
    }
}