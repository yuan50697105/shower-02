package com.idea.shower.db.mybaits.commons.pojo;

import com.idea.shower.db.mybaits.core.pojo.BaseDbCoreQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseDbQuery extends BaseDbCoreQuery {
    private Long id;
    private List<Long> ids;
    private String createUser;
    private Date createDateStart;
    private Date createDateEnd;
}