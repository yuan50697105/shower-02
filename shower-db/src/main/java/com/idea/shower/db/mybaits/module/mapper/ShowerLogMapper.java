package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseMapper;
import com.idea.shower.db.mybaits.module.pojo.ShowerLog;
import com.idea.shower.db.mybaits.module.pojo.ShowerLogExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShowerLogMapper extends BaseMapper {
    long countByExample(ShowerLogExample example);

    int deleteByExample(ShowerLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShowerLog record);

    int insertSelective(ShowerLog record);

    List<ShowerLog> selectByExample(ShowerLogExample example);

    ShowerLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShowerLog record, @Param("example") ShowerLogExample example);

    int updateByExample(@Param("record") ShowerLog record, @Param("example") ShowerLogExample example);

    int updateByPrimaryKeySelective(ShowerLog record);

    int updateByPrimaryKey(ShowerLog record);
}