package com.idea.shower.db.mybaits.module.dao;

import com.idea.shower.db.mybaits.commons.dao.CommonsDao;
import com.idea.shower.db.mybaits.module.pojo.SubscribeMessage;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-05-13 13:43
 */
public interface SubscribeMessageDao extends CommonsDao<SubscribeMessage,SubscribeMessage> {
    List<SubscribeMessage> getByOrderNo(String orderNo);
}
