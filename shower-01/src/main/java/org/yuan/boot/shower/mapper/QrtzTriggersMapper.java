package org.yuan.boot.shower.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.shower.pojo.QrtzTriggers;
import org.yuan.boot.shower.pojo.QrtzTriggersExample;

@Mapper
public interface QrtzTriggersMapper {
    long countByExample(QrtzTriggersExample example);

    int deleteByExample(QrtzTriggersExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzTriggers record);

    int insertSelective(QrtzTriggers record);

    List<QrtzTriggers> selectByExample(QrtzTriggersExample example);

    QrtzTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int updateByExampleSelective(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    int updateByExample(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    int updateByPrimaryKeySelective(QrtzTriggers record);

    int updateByPrimaryKey(QrtzTriggers record);
}