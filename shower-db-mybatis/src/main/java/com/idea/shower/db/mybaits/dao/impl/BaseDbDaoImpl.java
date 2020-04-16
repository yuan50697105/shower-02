package com.idea.shower.db.mybaits.dao.impl;

import com.github.pagehelper.PageInfo;
import com.idea.shower.db.core.pojo.WxPageResult;
import com.idea.shower.db.mybaits.dao.BaseDbDao;
import com.idea.shower.db.mybaits.mapper.BaseDbMapper;
import com.idea.shower.db.mybaits.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public abstract class BaseDbDaoImpl<T, ID extends Serializable, M extends BaseDbMapper> implements BaseDbDao<T, ID> {
    @Autowired
    private M baseMapper;

    public M baseMapper() {
        return baseMapper;
    }

    protected PageResult<T> pageResult(PageInfo<T> pageInfo) {
        return PageResult.of(pageInfo);
    }

    protected WxPageResult<T> wxPageResult(PageInfo<T> pageInfo) {
        return new WxPageResult<>(pageInfo.getList(), pageInfo.getTotal(), pageInfo.getPageNum());
    }
}
