package org.yuan.boot.webmvc.app.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.yuan.boot.webmvc.app.dao.BaseGoodsInfoDao;
import org.yuan.boot.webmvc.app.mapper.BaseGoodsInfoMapper;
import org.yuan.boot.webmvc.app.pojo.BaseGoodsInfo;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuanez
 * @create: 2020-01-13 14:56
 **/
@Component
@AllArgsConstructor
public class BaseGoodsInfoDaoImpl extends BaseDaoImpl<BaseGoodsInfo, BaseGoodsInfoMapper> implements BaseGoodsInfoDao {
}
