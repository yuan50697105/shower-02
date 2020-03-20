package com.idea.shower.app.db.module.pojo.query;

import com.idea.shower.app.db.commons.pojo.BaseDbQuery;
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
    private Long id;
    private String nickName;
    private String phone;

}