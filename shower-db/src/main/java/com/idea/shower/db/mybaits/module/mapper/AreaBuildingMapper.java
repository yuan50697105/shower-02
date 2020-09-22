package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.AreaBuilding;
import com.idea.shower.db.mybaits.module.pojo.AreaBuildingExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
<<<<<<< HEAD
public interface AreaBuildingMapper extends BaseDaoMapper<AreaBuilding> {
=======
public interface AreaBuildingMapper extends BaseDaoMapper<AreaBuilding>, BaseMapper<AreaBuilding> {
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
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