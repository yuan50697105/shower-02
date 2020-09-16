package com.idea.shower.db.mybaits.commons.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:45
 */
@Data
public class BaseDbQuery {
    private Integer page = 1;
    private Integer limit = 20;
    private String order;
    private String sort;
    private List<Long> id;
    private String creator;
    private Date createDateStart;
    private Date createDateEnd;
}