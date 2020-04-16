package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.app.db.module.pojo.MemberInfo;
import com.idea.shower.app.db.module.pojo.MemberInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberInfoMapper extends BaseMapper {
    long countByExample(MemberInfoExample example);

    int deleteByExample(MemberInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberInfo record);

    int insertSelective(MemberInfo record);

    List<MemberInfo> selectByExample(MemberInfoExample example);

    MemberInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberInfo record, @Param("example") MemberInfoExample example);

    int updateByExample(@Param("record") MemberInfo record, @Param("example") MemberInfoExample example);

    int updateByPrimaryKeySelective(MemberInfo record);

    int updateByPrimaryKey(MemberInfo record);
}