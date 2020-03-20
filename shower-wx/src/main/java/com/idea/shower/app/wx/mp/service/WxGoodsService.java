package com.idea.shower.app.wx.mp.service;

import com.idea.shower.app.commons.db.module.pojo.GoodsInfo;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:52
 */
public interface WxGoodsService {
    /**
     * 通过地区码获取起租价信息
     *
     * @param rangeCode 地区码
     * @return 定价信息
     */
    Optional<GoodsInfo> getRentalGoodsInfoByRangeCode(String rangeCode);

    /**
     * 同地区码获取续费价格
     *
     * @param rangeCode 地区码
     * @return 定价信息
     */
    Optional<GoodsInfo> getContinueGoodsInfoByRangeCode(String rangeCode);
}
