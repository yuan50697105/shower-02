package com.idea.shower.db.mybaits.module.dao;

import com.idea.shower.db.mybaits.commons.dao.BaseDao;
import com.idea.shower.db.mybaits.core.pojo.IWxPageResult;
import com.idea.shower.db.mybaits.module.pojo.Feedback;
import com.idea.shower.db.mybaits.module.pojo.query.FeedbackQuery;

import java.util.Optional;

/**
 * @author wcq
 * @title: FeedbackDao
 * @projectName shower-01
 * @date 2020/4/169:59
 */
public interface FeedbackDao extends BaseDao<Feedback> {

    void save(Feedback feedback);

    Optional<Feedback> getById(Long id);

    IWxPageResult<Feedback> selectPageByConditionWeXin(FeedbackQuery query);
}
