package com.idea.shower.db.mybaits.module.mapper.query;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.idea.shower.db.mybaits.module.pojo.ao.PriceInfoAo;
import com.idea.shower.db.mybaits.module.pojo.query.PriceInfoQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-10-30 12:38
 */
@Mapper
public interface PriceInfoQueryMapper {
    IPage<PriceInfoAo> selectPageByQuery(@Param("page") IPage<?> page, @Param("query") PriceInfoQuery query);

    List<PriceInfoAo> selectListByQuery(@Param("query") PriceInfoQuery query);
}
