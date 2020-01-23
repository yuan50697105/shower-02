package org.yuan.boot.shower.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.shower.commons.mapper.BaseMapper;
import org.yuan.boot.shower.db.pojo.WxOrderItem;
import org.yuan.boot.shower.db.pojo.WxOrderItemExample;

@Mapper
public interface WxOrderItemMapper extends BaseMapper<WxOrderItem> {
    long countByExample(WxOrderItemExample example);

    int deleteByExample(WxOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WxOrderItem record);

    int insertSelective(WxOrderItem record);

    List<WxOrderItem> selectByExample(WxOrderItemExample example);

    WxOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WxOrderItem record, @Param("example") WxOrderItemExample example);

    int updateByExample(@Param("record") WxOrderItem record, @Param("example") WxOrderItemExample example);

    int updateByPrimaryKeySelective(WxOrderItem record);

    int updateByPrimaryKey(WxOrderItem record);
}