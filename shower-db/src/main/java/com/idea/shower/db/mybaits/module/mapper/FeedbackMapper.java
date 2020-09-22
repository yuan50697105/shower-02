package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.Feedback;
import com.idea.shower.db.mybaits.module.pojo.FeedbackExample;
import com.idea.shower.db.mybaits.module.pojo.query.FeedbackQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FeedbackMapper extends BaseDaoMapper<Feedback> {

    long countByExample(FeedbackExample example);

    int deleteByExample(FeedbackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    List<Feedback> selectByExample(FeedbackExample example);

    Feedback selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Feedback record, @Param("example") FeedbackExample example);

    int updateByExample(@Param("record") Feedback record, @Param("example") FeedbackExample example);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);

    List<Feedback> selectByConditionWeXin(@Param("query") FeedbackQuery query);
}