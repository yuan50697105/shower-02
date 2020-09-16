package com.idea.shower.db.mybaits.module.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.db.mybaits.commons.pojo.WxPageResult;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.dao.FeedbackDao;
import com.idea.shower.db.mybaits.module.mapper.FeedbackMapper;
import com.idea.shower.db.mybaits.module.pojo.Feedback;
import com.idea.shower.db.mybaits.module.pojo.query.FeedbackQuery;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

/**
 * @author wcq
 * @title: FeedbackDaoImpl
 * @projectName shower-01
 * @date 2020/4/1610:04
 */
@Component
@AllArgsConstructor
public class FeedbackDaoImpl extends CommonsDaoImpl<Feedback,Feedback, FeedbackMapper> implements FeedbackDao {

    @Override
    public Optional<Feedback> getByIdOpt(Long id) {
        return Optional.ofNullable(baseDao().selectByPrimaryKey(id));
    }

    @Override
    public WxPageResult<Feedback> selectPageByConditionWeXin(FeedbackQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        PageInfo<Feedback> pageInfo = new PageInfo<>(baseDao().selectByConditionWeXin(query));
        return new WxPageResult<>(pageInfo);
    }

    @Override
    public QueryWrapper<Feedback> getWrapper(Map<String, Object> params) {
        return null;
    }
}
