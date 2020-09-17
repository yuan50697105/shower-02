package com.idea.shower.db.mybaits.module.dao;

import com.idea.shower.db.mybaits.commons.pojo.WxPageResult;
import com.idea.shower.db.mybaits.commons.dao.CommonsDao;
import com.idea.shower.db.mybaits.module.pojo.Feedback;
import com.idea.shower.db.mybaits.module.pojo.query.FeedbackQuery;

import java.util.Optional;

/**
 * @author wcq
 * @title: FeedbackDao
 * @projectName shower-01
 * @date 2020/4/169:59
 */
public interface FeedbackDao extends CommonsDao<Feedback,Feedback> {

<<<<<<< HEAD
    Optional<Feedback> getByIdOpt(Long id);

    WxPageResult<Feedback> selectPageByConditionWeXin(FeedbackQuery query);
=======
    void insert(Feedback feedback);

    Optional<Feedback> getByIdOpt(Long id);

    IWxPageResult<Feedback> selectPageByConditionWeXin(FeedbackQuery query);
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
}
