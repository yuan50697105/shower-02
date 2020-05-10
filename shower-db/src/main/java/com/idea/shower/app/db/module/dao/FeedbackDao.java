package com.idea.shower.app.db.module.dao;

import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.Feedback;
import com.idea.shower.app.db.module.pojo.query.FeedbackQuery;
import com.idea.shower.db.core.pojo.IWxPageResult;
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
