package com.idea.shower.app.db.module.pojo.query;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 10:55
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AreaBuildingQuery extends BaseDbEntity {
    private Long areaId;
    private String code;
    private String name;
}