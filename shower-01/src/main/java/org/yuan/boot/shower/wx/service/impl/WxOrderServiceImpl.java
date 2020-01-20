package org.yuan.boot.shower.wx.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.shower.db.dao.WxOrderInfoDao;
import org.yuan.boot.shower.db.pojo.WxOrderInfoCondition;
import org.yuan.boot.shower.wx.pojo.WxOrderVO;
import org.yuan.boot.shower.wx.service.WxOrderService;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:44
 */
@Service
@AllArgsConstructor
public class WxOrderServiceImpl implements WxOrderService {
    private WxOrderInfoDao wxOrderInfoDao;

    @Override
    public Result addOrder(WxOrderVO wxOrderVO) {
        return null;
    }

    @Override
    public Result getOrderList(WxOrderInfoCondition wxOrderInfoCondition) {
        return Results.data(new PageResult<>(wxOrderInfoDao.selectPageOrderByCreateTimeDesc(wxOrderInfoCondition)));
    }

}