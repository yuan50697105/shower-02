package org.yuan.boot.shower.wx.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.shower.db.dao.WxOrderInfoDao;
import org.yuan.boot.shower.db.pojo.WxOrderInfo;
import org.yuan.boot.shower.wx.converter.WxOrderConverter;
import org.yuan.boot.shower.wx.pojo.WxOrderVO;
import org.yuan.boot.shower.wx.service.WxAppointmentOrderService;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 12:05
 */
@Service
@AllArgsConstructor
@Log4j2
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class WxAppointmentOrderServiceImpl implements WxAppointmentOrderService {
    private WxOrderConverter wxOrderConverter;
    private WxOrderInfoDao wxOrderInfoDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result addOrder(WxOrderVO wxOrderVO) {
        WxOrderInfo wxOrderInfo = wxOrderConverter.convertForAddAppointment(wxOrderVO);
        wxOrderInfoDao.save(wxOrderInfo);
        return Results.ok();
    }
}