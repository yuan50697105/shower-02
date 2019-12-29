package org.yuan.boot.db.pojo;

import lombok.Data;

@Data
public class BaseCondition {
    private int page = 1;
    private int size = 20;

    public BaseCondition() {
    }

    public BaseCondition(int page, int size) {
        this.page = page;
        this.size = size;
    }
}
