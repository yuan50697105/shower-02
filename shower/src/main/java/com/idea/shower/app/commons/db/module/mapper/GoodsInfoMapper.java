package com.idea.shower.app.commons.db.module.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.idea.shower.app.commons.db.commons.mapper.BaseMapper;
import com.idea.shower.app.commons.db.module.pojo.GoodsInfo;
import com.idea.shower.app.commons.db.module.pojo.GoodsInfoExample;

@Mapper
public interface GoodsInfoMapper extends BaseMapper {
    long countByExample(GoodsInfoExample example);

    int deleteByExample(GoodsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsInfo record);

    int insertSelective(GoodsInfo record);

    List<GoodsInfo> selectByExample(GoodsInfoExample example);

    GoodsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsInfo record, @Param("example") GoodsInfoExample example);

    int updateByExample(@Param("record") GoodsInfo record, @Param("example") GoodsInfoExample example);

    int updateByPrimaryKeySelective(GoodsInfo record);

    int updateByPrimaryKey(GoodsInfo record);

    GoodsInfo selectOneByTypeAndRangeCode(@Param("type")Integer type,@Param("rangeCode")String rangeCode);


}