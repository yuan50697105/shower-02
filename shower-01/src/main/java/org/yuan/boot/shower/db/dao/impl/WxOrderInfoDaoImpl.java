package org.yuan.boot.shower.db.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.db.utils.PageResults;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.db.dao.WxOrderInfoDao;
import org.yuan.boot.shower.db.mapper.WxOrderInfoMapper;
import org.yuan.boot.shower.db.pojo.WxOrderInfo;
import org.yuan.boot.shower.db.pojo.WxOrderInfoCondition;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:15
 */
@Component
@AllArgsConstructor
public class WxOrderInfoDaoImpl extends BaseDaoImpl<WxOrderInfo, WxOrderInfoMapper> implements WxOrderInfoDao {
    @Override
    public PageResult<WxOrderInfo> selectPage(WxOrderInfoCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return PageResults.of(PageInfo.of(baseMapper().selectByCondition(condition)));
    }

    @Override
    public PageResult<WxOrderInfo> selectPageOrderByCreateTimeDesc(WxOrderInfoCondition condition) {
        return selectPage((WxOrderInfoCondition) condition.setOrder("create_time").setSort("desc"));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(WxOrderInfo wxOrderInfo) {
        baseMapper().insertSelective(wxOrderInfo);
    }

    @Override
    public Optional<WxOrderInfo> getById(Long orderId) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(orderId));
    }


}