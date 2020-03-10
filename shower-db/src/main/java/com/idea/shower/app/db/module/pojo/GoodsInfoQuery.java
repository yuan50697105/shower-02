package com.idea.shower.app.db.module.pojo;

import com.idea.shower.db.mybaits.pojo.BaseDbQuery;
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
public class GoodsInfoQuery extends BaseDbQuery {
    private Long id;
    private String code;
    private Integer type;

}