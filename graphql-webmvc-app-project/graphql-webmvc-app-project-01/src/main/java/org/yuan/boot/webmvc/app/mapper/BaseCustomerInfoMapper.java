package org.yuan.boot.webmvc.app.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfo;
import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfoExample;

public interface BaseCustomerInfoMapper {
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
}