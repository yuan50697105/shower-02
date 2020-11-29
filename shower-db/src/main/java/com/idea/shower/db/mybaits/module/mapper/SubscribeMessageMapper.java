package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.SubscribeMessage;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-25 20:18
 */
public interface SubscribeMessageMapper extends BaseDaoMapper<SubscribeMessage> {
    List<SubscribeMessage> selectListByOrderNo(String orderNo);
}