package com.idea.shower.db.mybaits.module.dao;

import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import com.idea.shower.db.mybaits.commons.dao.CommonsDao;
import com.idea.shower.db.mybaits.module.pojo.AreaInfo;
import com.idea.shower.db.mybaits.module.pojo.query.AreaInfoQuery;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 10:52
 */
public interface AreaInfoDao extends CommonsDao<AreaInfo> {
    List<AreaInfo> selectAll();

    PageResult<AreaInfo> selectPageByQuery(AreaInfoQuery query);

    List<AreaInfo> selectListByQuery(AreaInfoQuery query);

    AreaInfo get(Long id);

}
