package org.yuan.boot.shower.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.shower.pojo.QrtzCalendars;
import org.yuan.boot.shower.pojo.QrtzCalendarsExample;

@Mapper
public interface QrtzCalendarsMapper {
    long countByExample(QrtzCalendarsExample example);

    int deleteByExample(QrtzCalendarsExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("calendarName") String calendarName);

    int insert(QrtzCalendars record);

    int insertSelective(QrtzCalendars record);

    List<QrtzCalendars> selectByExample(QrtzCalendarsExample example);

    QrtzCalendars selectByPrimaryKey(@Param("schedName") String schedName, @Param("calendarName") String calendarName);

    int updateByExampleSelective(@Param("record") QrtzCalendars record, @Param("example") QrtzCalendarsExample example);

    int updateByExample(@Param("record") QrtzCalendars record, @Param("example") QrtzCalendarsExample example);

    int updateByPrimaryKeySelective(QrtzCalendars record);

    int updateByPrimaryKey(QrtzCalendars record);
}