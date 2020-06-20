package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.app.db.module.pojo.ShowerStorage;
import com.idea.shower.app.db.module.pojo.ShowerStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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