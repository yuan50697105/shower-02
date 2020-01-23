package org.yuan.boot.shower.wx.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.shower.db.dao.CustomerInfoDao;
import org.yuan.boot.shower.wx.converter.WxUserInfoConverter;
import org.yuan.boot.shower.wx.service.WxCustomerService;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:54
 */
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
@Log4j2
public class WxCustomerServiceImpl implements WxCustomerService {
    private CustomerInfoDao customerInfoDao;
    private WxUserInfoConverter wxUserInfoConverter;
    private WxMaService wxMaService;

    @SneakyThrows
    @Override
    public Result login(String jsCode) {
        WxMaJscode2SessionResult sessionInfo = wxMaService.getUserService().getSessionInfo(jsCode);
        return Results.data(sessionInfo);
    }


    @Override
    @SneakyThrows
    public Result getUserInfo(String jsCode) {
        // TODO: 2020/1/23 获取微信用户信息
        return null;
    }
}