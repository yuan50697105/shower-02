package org.yuan.boot.shower.db.dao;

import com.github.pagehelper.PageInfo;
import org.yuan.boot.shower.commons.dao.BaseDao;
import org.yuan.boot.shower.db.pojo.WxOrderInfo;
import org.yuan.boot.shower.db.pojo.WxOrderInfoCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:14
 */
public interface WxOrderInfoDao extends BaseDao<WxOrderInfo> {
    PageInfo<WxOrderInfo> selectPage(WxOrderInfoCondition wxOrderInfoCondition);

    PageInfo<WxOrderInfo> selectPageOrderByCreateTimeDesc(WxOrderInfoCondition condition);
}
