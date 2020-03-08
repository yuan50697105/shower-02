package com.idea.shower.shower.app.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.idea.shower.shower.app.commons.mapper.BaseMapper;
import com.idea.shower.shower.app.db.pojo.CustomerInfo;
import com.idea.shower.shower.app.db.pojo.CustomerInfoExample;

@Mapper
public interface CustomerInfoMapper extends BaseMapper {
    long countByExample(CustomerInfoExample example);

    int deleteByExample(CustomerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    List<CustomerInfo> selectByExample(CustomerInfoExample example);

    CustomerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByExample(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);
}