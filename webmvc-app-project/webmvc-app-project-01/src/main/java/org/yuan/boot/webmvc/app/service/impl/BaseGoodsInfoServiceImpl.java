package org.yuan.boot.webmvc.app.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.webmvc.app.dao.BaseGoodsInfoDao;
import org.yuan.boot.webmvc.app.pojo.converter.BaseGoodsInfoConverter;
import org.yuan.boot.webmvc.app.service.BaseGoodsInfoService;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuanez
 * @create: 2020-01-13 14:59
 **/
@Service
@AllArgsConstructor
public class BaseGoodsInfoServiceImpl implements BaseGoodsInfoService {
    private BaseGoodsInfoConverter baseGoodsInfoConverter;
    private BaseGoodsInfoDao baseGoodsInfoDao;
}
