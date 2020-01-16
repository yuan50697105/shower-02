package org.yuan.boot.webmvc.app.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.webmvc.app.dao.OrderInfoDao;
import org.yuan.boot.webmvc.app.pojo.converter.OrderInfoConverter;
import org.yuan.boot.webmvc.app.pojo.vo.OrderInfoVo;
import org.yuan.boot.webmvc.app.service.OrderInfoService;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-14 21:53
 */
@Service
@AllArgsConstructor
public class OrderInfoServiceImpl implements OrderInfoService {
    private OrderInfoConverter orderInfoConverter;
    private OrderInfoDao orderInfoDao;

    @Override
    public Result add(OrderInfoVo orderInfoVo) {
        // TODO: 2020/1/14 添加订单
        return null;
    }

    @Override
    public Result prepay(OrderInfoVo orderInfoVo) {
        // TODO: 2020/1/14 预支付
        return null;
    }
}