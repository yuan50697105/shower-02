package com.idea.shower.app.commons.pojo;

import com.idea.shower.db.core.pojo.BaseDbCoreQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseConditionQuery extends BaseDbCoreQuery {
    private Long id;
    private String createUser;
    private Date creatDateStart;
    private Date createDateEnd;
}