package org.yuan.boot.shower.db.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.constant.GoodsInfoConstants;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.db.dao.GoodsInfoDao;
import org.yuan.boot.shower.db.mapper.GoodsInfoMapper;
import org.yuan.boot.shower.db.pojo.GoodsInfo;

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