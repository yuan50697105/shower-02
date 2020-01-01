package org.yuan.boot.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 14:30
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseCondition extends AbstractBaseCoreCondition {
    public BaseCondition() {
    }

    public BaseCondition(int page, int size) {
        super(page, size);
    }
}