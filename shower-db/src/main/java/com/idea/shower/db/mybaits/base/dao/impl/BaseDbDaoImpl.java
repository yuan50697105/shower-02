package com.idea.shower.db.mybaits.base.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import com.idea.shower.db.mybaits.base.dao.BaseDbDao;
import com.idea.shower.db.mybaits.base.mapper.BaseDbMapper;
import com.idea.shower.db.mybaits.base.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public abstract class BaseDbDaoImpl<T, ID extends Serializable, M extends BaseDbMapper<T>> extends ServiceImpl<M, T> implements BaseDbDao<T, ID> {
    @Autowired
    private M baseMapper;

    public M baseMapper() {
        return baseMapper;
    }

    protected PageResult<T> pageResult(PageInfo<T> pageInfo) {
        return PageResult.of(pageInfo);
    }

}
