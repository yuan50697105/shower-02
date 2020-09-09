package com.idea.shower.db.mybaits.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.AreaInfo;
import com.idea.shower.db.mybaits.module.pojo.AreaInfoExample;
import com.idea.shower.db.mybaits.module.pojo.query.AreaInfoQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AreaInfoMapper extends BaseDaoMapper<AreaInfo>, BaseMapper<AreaInfo> {
    long countByExample(AreaInfoExample example);

    int deleteByExample(AreaInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AreaInfo record);

    int insertSelective(AreaInfo record);

    List<AreaInfo> selectByExample(AreaInfoExample example);

    AreaInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    int updateByExample(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    int updateByPrimaryKeySelective(AreaInfo record);

    int updateByPrimaryKey(AreaInfo record);

    List<AreaInfo> selectByQuery(AreaInfoQuery query);
}