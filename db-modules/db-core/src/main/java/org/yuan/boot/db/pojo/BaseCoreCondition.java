package org.yuan.boot.db.pojo;

import lombok.Data;

@Data
public class BaseCoreCondition {
    private int page = 1;
    private int size = 20;

    public BaseCoreCondition() {
    }

    public BaseCoreCondition(int page, int size) {
        this.page = page;
        this.size = size;
    }
}
