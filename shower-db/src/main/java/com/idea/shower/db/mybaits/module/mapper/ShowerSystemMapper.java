package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseMapper;
import com.idea.shower.db.mybaits.module.pojo.ShowerSystem;
import com.idea.shower.db.mybaits.module.pojo.ShowerSystemExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShowerSystemMapper extends BaseMapper {
    long countByExample(ShowerSystemExample example);

    int deleteByExample(ShowerSystemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShowerSystem record);

    int insertSelective(ShowerSystem record);

    List<ShowerSystem> selectByExample(ShowerSystemExample example);

    ShowerSystem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShowerSystem record, @Param("example") ShowerSystemExample example);

    int updateByExample(@Param("record") ShowerSystem record, @Param("example") ShowerSystemExample example);

    int updateByPrimaryKeySelective(ShowerSystem record);

    int updateByPrimaryKey(ShowerSystem record);
}