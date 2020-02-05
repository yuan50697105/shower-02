package org.yuan.boot.shower.wx.service;

import org.yuan.boot.shower.db.pojo.GoodsInfo;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:52
 */
public interface WxGoodsService {
    Optional<GoodsInfo> getByBaseGoodsInfoByRangeCode(String rangeCode);
}
