package com.idea.shower.app.db.module.dao;

import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.AreaInfo;
import com.idea.shower.app.db.module.pojo.query.AreaInfoQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 10:52
 */
public interface AreaInfoDao extends BaseDao<AreaInfo> {
    List<AreaInfo> selectAll();

    PageResult<AreaInfo> selectPageByQuery(AreaInfoQuery query);

    List<AreaInfo> selectListByQuery(AreaInfoQuery query);

    AreaInfo get(Long id);

    int insert(AreaInfo areaInfo);
}
