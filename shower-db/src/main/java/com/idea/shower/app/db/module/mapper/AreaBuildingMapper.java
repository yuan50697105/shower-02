package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.app.db.module.pojo.AreaBuilding;
import com.idea.shower.app.db.module.pojo.AreaBuildingExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AreaBuildingMapper extends BaseMapper {
    long countByExample(AreaBuildingExample example);

    int deleteByExample(AreaBuildingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AreaBuilding record);

    int insertSelective(AreaBuilding record);

    List<AreaBuilding> selectByExample(AreaBuildingExample example);

    AreaBuilding selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AreaBuilding record, @Param("example") AreaBuildingExample example);

    int updateByExample(@Param("record") AreaBuilding record, @Param("example") AreaBuildingExample example);

    int updateByPrimaryKeySelective(AreaBuilding record);

    int updateByPrimaryKey(AreaBuilding record);
}