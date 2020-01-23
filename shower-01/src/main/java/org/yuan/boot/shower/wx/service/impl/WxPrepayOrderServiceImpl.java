package org.yuan.boot.shower.wx.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.db.dao.WxOrderInfoDao;
import org.yuan.boot.shower.db.dao.WxOrderItemDao;
import org.yuan.boot.shower.db.pojo.WxOrderInfo;
import org.yuan.boot.shower.wx.converter.WxOrderConverter;
import org.yuan.boot.shower.wx.pojo.WxOrderVO;
import org.yuan.boot.shower.wx.service.WxPrepayOrderService;
import org.yuan.boot.webmvc.exception.DataParamsErrorResultRuntimeException;
import org.yuan.boot.webmvc.pojo.Result;
import org.yuan.boot.webmvc.utils.Results;

import java.math.BigDecimal;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 11:53
 */
@Service
@AllArgsConstructor
@Log4j2
public class WxPrepayOrderServiceImpl implements WxPrepayOrderService {
    private WxOrderConverter wxOrderConverter;
    private WxOrderInfoDao wxOrderInfoDao;
    private WxOrderItemDao wxOrderItemDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result addOrder(WxOrderVO wxOrderVO) {
        BigDecimal prepayDecimal = wxOrderVO.getPrepayDecimal();
        if (prepayDecimal.compareTo(BigDecimal.ZERO) <= 0) {
            throw new DataParamsErrorResultRuntimeException("预支付金额错误");
        }
        WxOrderInfo wxOrderInfo = wxOrderConverter.convertForAddPrepay(wxOrderVO);
        wxOrderInfoDao.save(wxOrderInfo);

        return Results.ok();
    }
}