package com.idea.shower.db.mybaits.dao.impl;

import com.github.pagehelper.IPage;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.db.core.pojo.WxPageResult;
import com.idea.shower.db.mybaits.dao.BaseDbDao;
import com.idea.shower.db.mybaits.mapper.BaseDbMapper;
import com.idea.shower.db.mybaits.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.function.Function;

@SuppressWarnings("SpringJavaAutowiredMembersInspection")
public abstract class BaseDbDaoImpl<T, ID extends Serializable, M extends BaseDbMapper> implements BaseDbDao<T, ID> {
    @Autowired
    private M baseMapper;

    public M baseMapper() {
        return baseMapper;
    }

    protected <E extends IPage> PageResult<T> pageResult(E condition, Function<E, List<T>> function) {
        PageHelper.startPage(condition.getPageNum(), condition.getPageSize());
        return pageResult(PageInfo.of(function.apply(condition)));
    }

    protected PageResult<T> pageResult(PageInfo<T> pageInfo) {
        return PageResult.of(pageInfo);
    }

    protected WxPageResult<T> wxPageResult(PageInfo<T> pageInfo) {
        return new WxPageResult<>(pageInfo.getList(), pageInfo.getTotal());
    }
}
