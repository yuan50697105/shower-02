package com.idea.shower.db.mybaits.module.pojo.query;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
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

    public void copyFromByOptions(BaseDbEntity t, CopyOptions copyOptions) {
        BeanUtil.copyProperties(t, this, copyOptions);
    }
}