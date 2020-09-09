package com.idea.shower.db.mybaits.core.pojo;

import lombok.Data;

@Data
public abstract class BaseDbCoreQuery {
    private Integer page = 1;
    private Integer limit = 20;
    private String order;
    private String sort;
}
