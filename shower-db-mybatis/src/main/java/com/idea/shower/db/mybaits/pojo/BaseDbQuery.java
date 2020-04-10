package com.idea.shower.db.mybaits.pojo;

import com.github.pagehelper.IPage;
import com.idea.shower.db.core.pojo.BaseDbCoreQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 14:30
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseDbQuery extends BaseDbCoreQuery implements IPage {


    @Override
    public String getOrderBy() {
        return null;

    }
}