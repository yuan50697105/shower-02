package com.idea.shower.admin.price.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.admin.price.service.PriceInfoService;
import com.idea.shower.db.mybaits.module.mapper.PriceInfoMapper;
import com.idea.shower.db.mybaits.module.pojo.PriceInfo;
import com.idea.shower.db.mybaits.module.pojo.ao.PriceInfoAo;
import io.renren.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Override
    public QueryWrapper<PriceInfo> getWrapper(Map<String, Object> params) {
        return null;
    }


}