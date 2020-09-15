package com.idea.shower.db.mybaits.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.db.mybaits.base.pojo.WxPageResult;
import com.idea.shower.db.mybaits.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.db.mybaits.core.pojo.IWxPageResult;
import com.idea.shower.db.mybaits.module.dao.FeedbackDao;
import com.idea.shower.db.mybaits.module.mapper.FeedbackMapper;
import com.idea.shower.db.mybaits.module.pojo.Feedback;
import com.idea.shower.db.mybaits.module.pojo.query.FeedbackQuery;
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
    public void insert(Feedback feedback) {
        baseMapper().insertSelective(feedback);
    }

    @Override
    public Optional<Feedback> getByIdOpt(Long id) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    public IWxPageResult<Feedback> selectPageByConditionWeXin(FeedbackQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        PageInfo<Feedback> pageInfo = new PageInfo<>(baseMapper().selectByConditionWeXin(query));
        return new WxPageResult<>(pageInfo);
    }
}
