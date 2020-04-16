package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.app.db.module.pojo.PriceInfo;
import com.idea.shower.app.db.module.pojo.PriceInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PriceInfoMapper extends BaseMapper {
    long countByExample(PriceInfoExample example);

    int deleteByExample(PriceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PriceInfo record);

    int insertSelective(PriceInfo record);

    List<PriceInfo> selectByExample(PriceInfoExample example);

    PriceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PriceInfo record, @Param("example") PriceInfoExample example);

    int updateByExample(@Param("record") PriceInfo record, @Param("example") PriceInfoExample example);

    int updateByPrimaryKeySelective(PriceInfo record);

    int updateByPrimaryKey(PriceInfo record);

    PriceInfo selectOneByPriceCodeAndType(@Param("priceCode") String priceCode, @Param("type") Integer type);
}