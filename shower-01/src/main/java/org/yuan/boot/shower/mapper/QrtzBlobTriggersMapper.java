package org.yuan.boot.shower.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.shower.pojo.QrtzBlobTriggers;
import org.yuan.boot.shower.pojo.QrtzBlobTriggersExample;

@Mapper
public interface QrtzBlobTriggersMapper {
    long countByExample(QrtzBlobTriggersExample example);

    int deleteByExample(QrtzBlobTriggersExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzBlobTriggers record);

    int insertSelective(QrtzBlobTriggers record);

    List<QrtzBlobTriggers> selectByExample(QrtzBlobTriggersExample example);

    QrtzBlobTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int updateByExampleSelective(@Param("record") QrtzBlobTriggers record, @Param("example") QrtzBlobTriggersExample example);

    int updateByExample(@Param("record") QrtzBlobTriggers record, @Param("example") QrtzBlobTriggersExample example);

    int updateByPrimaryKeySelective(QrtzBlobTriggers record);

    int updateByPrimaryKey(QrtzBlobTriggers record);
}