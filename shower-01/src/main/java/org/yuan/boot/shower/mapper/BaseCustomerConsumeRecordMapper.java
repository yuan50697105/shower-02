package org.yuan.boot.shower.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.shower.pojo.BaseCustomerConsumeRecord;
import org.yuan.boot.shower.pojo.BaseCustomerConsumeRecordExample;

import java.util.List;

@Mapper
public interface BaseCustomerConsumeRecordMapper extends BaseMapper<BaseCustomerConsumeRecord> {
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
}