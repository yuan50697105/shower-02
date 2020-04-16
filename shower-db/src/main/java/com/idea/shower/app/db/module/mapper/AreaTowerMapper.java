package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.app.db.module.pojo.AreaTower;
import com.idea.shower.app.db.module.pojo.AreaTowerExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AreaTowerMapper extends BaseMapper {
    long countByExample(AreaTowerExample example);

    int deleteByExample(AreaTowerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AreaTower record);

    int insertSelective(AreaTower record);

    List<AreaTower> selectByExample(AreaTowerExample example);

    AreaTower selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AreaTower record, @Param("example") AreaTowerExample example);

    int updateByExample(@Param("record") AreaTower record, @Param("example") AreaTowerExample example);

    int updateByPrimaryKeySelective(AreaTower record);

    int updateByPrimaryKey(AreaTower record);
}