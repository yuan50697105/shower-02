package com.idea.shower.admin.price.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.admin.price.service.PriceInfoService;
import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import com.idea.shower.db.mybaits.module.dao.PriceInfoDao;
import com.idea.shower.db.mybaits.module.mapper.PriceInfoMapper;
import com.idea.shower.db.mybaits.module.pojo.PriceInfo;
import com.idea.shower.db.mybaits.module.pojo.ao.PriceInfoAo;
import com.idea.shower.db.mybaits.module.pojo.query.PriceInfoQuery;
import io.renren.common.service.impl.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-10-30 12:33
 */
@Service
@Transactional
public class PriceInfoServiceImpl extends CrudServiceImpl<PriceInfoMapper, PriceInfo, PriceInfoAo> implements PriceInfoService {
    @Autowired
    private PriceInfoDao priceInfoDao;

    @Override
    public QueryWrapper<PriceInfo> getWrapper(Map<String, Object> params) {
        return null;
    }


    @Override
    public PageResult<PriceInfo> data(PriceInfoQuery query) {
        return priceInfoDao.selectPageByQuery(query);
    }

    @Override
    public List<PriceInfoAo> list(PriceInfoQuery query) {
        return priceInfoDao.selectListByQuery(query);
    }

    @Override
    public void add(PriceInfo priceInfo) {
        priceInfoDao.save(priceInfo);
    }

    @Override
    public void update(PriceInfo priceInfo) {
        priceInfoDao.update(priceInfo);
    }

    @Override
    public void delete(Long id) {
        priceInfoDao.deleteById(id);
    }

    @Override
    public void delete(List<Long> id) {
        priceInfoDao.deleteBatchIds(id);
    }
}