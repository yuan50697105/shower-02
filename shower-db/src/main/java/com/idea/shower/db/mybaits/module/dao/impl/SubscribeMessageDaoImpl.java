package com.idea.shower.db.mybaits.module.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.db.mybaits.module.dao.SubscribeMessageDao;
import com.idea.shower.db.mybaits.module.mapper.SubscribeMessageMapper;
import com.idea.shower.db.mybaits.module.pojo.SubscribeMessage;
import io.renren.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-25 20:20
 */
@Component
@Transactional
public class SubscribeMessageDaoImpl extends CrudServiceImpl<SubscribeMessageMapper,SubscribeMessage, SubscribeMessage> implements SubscribeMessageDao {
    @Override
    public QueryWrapper<SubscribeMessage> getWrapper(Map<String, Object> params) {
        return null;
    }
}