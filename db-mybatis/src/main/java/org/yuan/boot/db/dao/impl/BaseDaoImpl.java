package org.yuan.boot.db.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.yuan.boot.db.dao.BaseDao;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.pojo.CoreCondition;
import org.yuan.boot.db.pojo.PageResult;

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

    protected <E extends CoreCondition> PageResult<T> pageResult(E condition, Function<E, List<T>> function) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return PageResult.of(PageInfo.of(function.apply(condition)));
    }

}
