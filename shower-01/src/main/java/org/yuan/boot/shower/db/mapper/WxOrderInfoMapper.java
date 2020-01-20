package org.yuan.boot.shower.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.shower.commons.mapper.BaseMapper;
import org.yuan.boot.shower.db.pojo.WxOrderInfo;
import org.yuan.boot.shower.db.pojo.WxOrderInfoCondition;
import org.yuan.boot.shower.db.pojo.WxOrderInfoExample;

import java.util.List;

@Mapper
public interface WxOrderInfoMapper extends BaseMapper<WxOrderInfo> {
    long countByExample(WxOrderInfoExample example);

    int deleteByExample(WxOrderInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WxOrderInfo record);

    int insertSelective(WxOrderInfo record);

    List<WxOrderInfo> selectByExample(WxOrderInfoExample example);

    WxOrderInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WxOrderInfo record, @Param("example") WxOrderInfoExample example);

    int updateByExample(@Param("record") WxOrderInfo record, @Param("example") WxOrderInfoExample example);

    int updateByPrimaryKeySelective(WxOrderInfo record);

    int updateByPrimaryKey(WxOrderInfo record);

    List<WxOrderInfo> selectByCondition(WxOrderInfoCondition condition);
}