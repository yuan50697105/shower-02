package com.idea.shower.db.mybaits.commons.dao.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import com.idea.shower.db.mybaits.commons.dao.CommonsDao;
import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import io.renren.common.page.PageData;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 16:27
 */
public abstract class CommonsDaoImpl<T, D, M extends BaseDaoMapper<T>> extends io.renren.common.service.impl.CrudServiceImpl<M, T, D> implements CommonsDao<T, D>, io.renren.common.service.CrudService<T, D> {

    public M baseDao() {
        return super.baseDao;
    }

    protected PageResult<T> pageResult(PageInfo<T> pageInfo) {
        return PageResult.of(pageInfo);
    }

    protected PageData<T> pageData(PageInfo<T> pageInfo) {
        return new PageData<>(pageInfo.getList(), pageInfo.getTotal());
    }

    protected PageData<T> pageData(IPage<T> iPage) {
        return new PageData<>(iPage.getRecords(), iPage.getTotal());
    }
}