package org.yuan.boot.shower.wx.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.shower.db.dao.GoodsInfoDao;
import org.yuan.boot.shower.db.pojo.GoodsInfo;
import org.yuan.boot.shower.wx.service.WxGoodsService;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:52
 */
@Service
@AllArgsConstructor
public class WxGoodsServiceImpl implements WxGoodsService {
    private GoodsInfoDao goodsInfoDao;

    @Override
    public Optional<GoodsInfo> getRentalGoodsInfoByRangeCode(String rangeCode) {
        return Optional.ofNullable(goodsInfoDao.getRentalGoodsInfoByRangeCode(rangeCode));
    }

    @Override
    public Optional<GoodsInfo> getContinueGoodsInfoByRangeCode(String rangeCode) {
        return Optional.ofNullable(goodsInfoDao.getContinueGoodsInfoByRangeCode(rangeCode));
    }

}