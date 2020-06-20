package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.app.db.module.pojo.ShowerSystem;
import com.idea.shower.app.db.module.pojo.ShowerSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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