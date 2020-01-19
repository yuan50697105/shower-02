package org.yuan.boot.shower.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.shower.pojo.BaseCustomerConsumeRecord;
import org.yuan.boot.shower.pojo.BaseCustomerConsumeRecordExample;import org.yuan.boot.shower.pojo.condition.BaseCustomerConsumeRecordCondition;

@Mapper
public interface BaseCustomerConsumeRecordMapper {
    long countByExample(BaseCustomerConsumeRecordExample example);

    int deleteByExample(BaseCustomerConsumeRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseCustomerConsumeRecord record);

    int insertSelective(BaseCustomerConsumeRecord record);

    List<BaseCustomerConsumeRecord> selectByExample(BaseCustomerConsumeRecordExample example);

    BaseCustomerConsumeRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseCustomerConsumeRecord record, @Param("example") BaseCustomerConsumeRecordExample example);

    int updateByExample(@Param("record") BaseCustomerConsumeRecord record, @Param("example") BaseCustomerConsumeRecordExample example);

    int updateByPrimaryKeySelective(BaseCustomerConsumeRecord record);

    int updateByPrimaryKey(BaseCustomerConsumeRecord record);

    List<BaseCustomerConsumeRecord> selectByCondition(@Param("condition") BaseCustomerConsumeRecordCondition condition);
}