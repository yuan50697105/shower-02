package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseMapper;
import com.idea.shower.db.mybaits.module.pojo.ShowerStorage;
import com.idea.shower.db.mybaits.module.pojo.ShowerStorageExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShowerStorageMapper extends BaseMapper {
    long countByExample(ShowerStorageExample example);

    int deleteByExample(ShowerStorageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShowerStorage record);

    int insertSelective(ShowerStorage record);

    List<ShowerStorage> selectByExample(ShowerStorageExample example);

    ShowerStorage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShowerStorage record, @Param("example") ShowerStorageExample example);

    int updateByExample(@Param("record") ShowerStorage record, @Param("example") ShowerStorageExample example);

    int updateByPrimaryKeySelective(ShowerStorage record);

    int updateByPrimaryKey(ShowerStorage record);
}