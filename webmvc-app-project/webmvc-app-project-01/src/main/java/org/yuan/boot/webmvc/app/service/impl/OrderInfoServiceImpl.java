package org.yuan.boot.webmvc.app.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.webmvc.app.dao.OrderInfoDao;
import org.yuan.boot.webmvc.app.pojo.converter.OrderInfoConverter;
import org.yuan.boot.webmvc.app.service.OrderInfoService;

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
}