package com.idea.shower.db.core.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public abstract class BaseCoreQuery {
    private int page = 1;
    private int size = 20;
    private String order;
    private String sort;

    public BaseCoreQuery() {
    }

    public BaseCoreQuery(int page, int size) {
        this.page = page;
        this.size = size;
    }

    public BaseCoreQuery(int page, int size, String order, String sort) {
        this.page = page;
        this.size = size;
        this.order = order;
        this.sort = sort;
    }
}
