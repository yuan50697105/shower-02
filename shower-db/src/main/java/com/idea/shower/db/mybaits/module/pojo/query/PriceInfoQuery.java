package com.idea.shower.db.mybaits.module.pojo.query;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:04
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PriceInfoQuery extends BaseDbQuery {
    private Long areaId;
    private String code;
    private Integer type;

}