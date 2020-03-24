package com.idea.shower.db.core.pojo;

import lombok.Data;

@Data
public abstract class BaseDbCoreQuery {
    private Integer pageNum = 1;
    private Integer pageSize = 20;
    private String order;
    private String sort;
}
