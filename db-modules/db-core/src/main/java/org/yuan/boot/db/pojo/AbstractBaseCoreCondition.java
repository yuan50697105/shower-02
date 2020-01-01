package org.yuan.boot.db.pojo;

import lombok.Data;

@Data
public abstract class AbstractBaseCoreCondition {
    private int page = 1;
    private int size = 20;

    public AbstractBaseCoreCondition() {
    }

    public AbstractBaseCoreCondition(int page, int size) {
        this.page = page;
        this.size = size;
    }
}
