package com.idea.shower.shower.db.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.idea.shower.shower.commons.constant.GoodsInfoConstants;
import com.idea.shower.shower.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.shower.db.dao.GoodsInfoDao;
import com.idea.shower.shower.db.mapper.GoodsInfoMapper;
import com.idea.shower.shower.db.pojo.GoodsInfo;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:05
 */
@Component
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class, propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class GoodsInfoDaoImpl extends BaseDaoImpl<GoodsInfo, GoodsInfoMapper> implements GoodsInfoDao {
    @Override
    public GoodsInfo getRentalGoodsInfoByRangeCode(String rangeCode) {
        return baseMapper().selectOneByTypeAndRangeCode(GoodsInfoConstants.GoodsInfoType.RENTAL, rangeCode);
    }

    @Override
    public GoodsInfo getContinueGoodsInfoByRangeCode(String rangeCode) {
        return baseMapper().selectOneByTypeAndRangeCode(GoodsInfoConstants.GoodsInfoType.CONTINUE, rangeCode);
    }
}