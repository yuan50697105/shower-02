package org.yuan.boot.shower.db.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.db.dao.WxOrderItemDao;
import org.yuan.boot.shower.db.mapper.WxOrderItemMapper;
import org.yuan.boot.shower.db.pojo.WxOrderItem;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 11:01
 */
@Component
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class WxOrderItemDaoImpl extends BaseDaoImpl<WxOrderItem, WxOrderItemMapper> implements WxOrderItemDao {
}