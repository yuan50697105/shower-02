package org.yuan.boot.shower.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.shower.commons.mapper.BaseMapper;
import org.yuan.boot.shower.db.pojo.WxCustomer;
import org.yuan.boot.shower.db.pojo.WxCustomerCondition;import org.yuan.boot.shower.db.pojo.WxCustomerExample;

@Mapper
public interface WxCustomerMapper extends BaseMapper<WxCustomer> {
    long countByExample(WxCustomerExample example);

    int deleteByExample(WxCustomerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WxCustomer record);

    int insertSelective(WxCustomer record);

    List<WxCustomer> selectByExample(WxCustomerExample example);

    WxCustomer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WxCustomer record, @Param("example") WxCustomerExample example);

    int updateByExample(@Param("record") WxCustomer record, @Param("example") WxCustomerExample example);

    int updateByPrimaryKeySelective(WxCustomer record);

    int updateByPrimaryKey(WxCustomer record);

    List<WxCustomer> selectByCondition(WxCustomerCondition condition);
}