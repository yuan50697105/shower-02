package com.idea.shower.db.mybaits.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import com.idea.shower.db.mybaits.dao.BaseDao;
import com.idea.shower.db.mybaits.mapper.BaseMapper;
import com.idea.shower.db.core.pojo.BaseCoreQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;

import java.io.Serializable;
import java.util.List;
import java.util.function.Function;

@SuppressWarnings("SpringJavaAutowiredMembersInspection")
public abstract class BaseDaoImpl<T, ID extends Serializable, M extends BaseMapper> implements BaseDao<T, ID> {
    @Autowired
    private M baseMapper;

    public M baseMapper() {
        return baseMapper;
    }

    protected <E extends BaseCoreQuery> PageResult<T> pageResult(E condition, Function<E, List<T>> function) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return PageResult.of(PageInfo.of(function.apply(condition)));
    }

    protected PageResult<T> pageResult(PageInfo<T> pageInfo) {
        return PageResult.of(pageInfo);
    }

}
