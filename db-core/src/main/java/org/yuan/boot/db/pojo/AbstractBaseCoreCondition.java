package org.yuan.boot.db.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public abstract class AbstractBaseCoreCondition<T> {
    private int page = 1;
    private int size = 20;
    private String order;
    private String sort;

    public AbstractBaseCoreCondition() {
    }

    public AbstractBaseCoreCondition(int page, int size) {
        this.page = page;
        this.size = size;
    }

    public AbstractBaseCoreCondition(int page, int size, String order, String sort) {
        this.page = page;
        this.size = size;
        this.order = order;
        this.sort = sort;
    }
}
