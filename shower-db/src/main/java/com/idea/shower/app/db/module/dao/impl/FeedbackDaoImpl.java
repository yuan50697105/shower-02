package com.idea.shower.app.db.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.dao.FeedbackDao;
import com.idea.shower.app.db.module.mapper.FeedbackMapper;
import com.idea.shower.app.db.module.pojo.Feedback;
import com.idea.shower.app.db.module.pojo.query.FeedbackQuery;
import com.idea.shower.db.core.pojo.WxPageResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author wcq
 * @title: FeedbackDaoImpl
 * @projectName shower-01
 * @date 2020/4/1610:04
 */
@Component
@AllArgsConstructor
public class FeedbackDaoImpl extends BaseDaoImpl<Feedback, FeedbackMapper> implements FeedbackDao {
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(Feedback feedback) {
        baseMapper().insertSelective(feedback);
    }

    @Override
    public Optional<Feedback> getById(Long id) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    public WxPageResult<Feedback> selectPageByConditionWeXin(FeedbackQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        new PageInfo<>(baseMapper().selectByConditionWeXin(query));
        return new WxPageResult<>();
    }
}
