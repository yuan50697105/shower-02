package org.yuan.boot.webmvc.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.webmvc.app.pojo.BaseGoodsInfo;
import org.yuan.boot.webmvc.app.pojo.BaseGoodsInfoExample;

import java.util.List;

@Mapper
public interface BaseGoodsInfoMapper extends BaseMapper<BaseGoodsInfo> {
    long countByExample(BaseGoodsInfoExample example);

    int deleteByExample(BaseGoodsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseGoodsInfo record);

    int insertSelective(BaseGoodsInfo record);

    List<BaseGoodsInfo> selectByExample(BaseGoodsInfoExample example);

    BaseGoodsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseGoodsInfo record, @Param("example") BaseGoodsInfoExample example);

    int updateByExample(@Param("record") BaseGoodsInfo record, @Param("example") BaseGoodsInfoExample example);

    int updateByPrimaryKeySelective(BaseGoodsInfo record);

    int updateByPrimaryKey(BaseGoodsInfo record);
}