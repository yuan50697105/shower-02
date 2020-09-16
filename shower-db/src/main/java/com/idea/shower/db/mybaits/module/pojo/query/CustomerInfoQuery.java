package com.idea.shower.db.mybaits.module.pojo.query;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:27
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerInfoQuery extends BaseDbQuery {
    private String nickName;
    private String phone;

}