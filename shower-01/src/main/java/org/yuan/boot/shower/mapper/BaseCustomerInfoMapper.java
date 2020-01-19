package org.yuan.boot.shower.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.shower.pojo.BaseCustomerInfo;
import org.yuan.boot.shower.pojo.BaseCustomerInfoExample;import org.yuan.boot.shower.pojo.condition.BaseCustomerInfoCondition;

@Mapper
public interface BaseCustomerInfoMapper extends BaseMapper<BaseCustomerInfo> {
    long countByExample(BaseCustomerInfoExample example);

    int deleteByExample(BaseCustomerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseCustomerInfo record);

    int insertSelective(BaseCustomerInfo record);

    List<BaseCustomerInfo> selectByExample(BaseCustomerInfoExample example);

    BaseCustomerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseCustomerInfo record, @Param("example") BaseCustomerInfoExample example);

    int updateByExample(@Param("record") BaseCustomerInfo record, @Param("example") BaseCustomerInfoExample example);

    int updateByPrimaryKeySelective(BaseCustomerInfo record);

    int updateByPrimaryKey(BaseCustomerInfo record);

    List<BaseCustomerInfo> selectByCondition(@Param("condition") BaseCustomerInfoCondition condition);

    BaseCustomerInfo selectOneByCondition(@Param("customerInfo") BaseCustomerInfo customerInfo);
}