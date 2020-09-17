package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.CustomerInfo;
import com.idea.shower.db.mybaits.module.pojo.CustomerInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
<<<<<<< HEAD
public interface CustomerInfoMapper extends BaseDaoMapper<CustomerInfo> {
=======
public interface CustomerInfoMapper extends BaseDaoMapper<CustomerInfo>, BaseMapper<CustomerInfo> {
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
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

    CustomerInfo selectOneByUnionId(@Param("unionId") String unionId);

    CustomerInfo selectOneById(@Param("id") String id);

    CustomerInfo selectOneByOpenId(@Param("openId") String openId);
}