package com.idea.shower.db.mybaits.pojo;

import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.IPage;
import com.idea.shower.db.core.pojo.BaseCoreQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Struct;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 14:30
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseDbQuery extends BaseCoreQuery implements IPage {


    @Override
    public String getOrderBy() {
        String orderBy = "";
        if (StrUtil.isNotEmpty(getOrder())) {
            orderBy += StrUtil.toUnderlineCase(getOrder());
            if (StrUtil.isNotEmpty(getSort())) {
                orderBy += " " + getSort();
            }
        }
        return orderBy;

    }
}