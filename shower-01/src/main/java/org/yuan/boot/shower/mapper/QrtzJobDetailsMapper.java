package org.yuan.boot.shower.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.shower.pojo.QrtzJobDetails;
import org.yuan.boot.shower.pojo.QrtzJobDetailsExample;

@Mapper
public interface QrtzJobDetailsMapper {
    long countByExample(QrtzJobDetailsExample example);

    int deleteByExample(QrtzJobDetailsExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("jobName") String jobName, @Param("jobGroup") String jobGroup);

    int insert(QrtzJobDetails record);

    int insertSelective(QrtzJobDetails record);

    List<QrtzJobDetails> selectByExample(QrtzJobDetailsExample example);

    QrtzJobDetails selectByPrimaryKey(@Param("schedName") String schedName, @Param("jobName") String jobName, @Param("jobGroup") String jobGroup);

    int updateByExampleSelective(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    int updateByExample(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    int updateByPrimaryKeySelective(QrtzJobDetails record);

    int updateByPrimaryKey(QrtzJobDetails record);
}