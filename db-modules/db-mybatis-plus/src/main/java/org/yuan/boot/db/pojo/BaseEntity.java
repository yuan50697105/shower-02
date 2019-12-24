package org.yuan.boot.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.core.BaseCoreEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class BaseEntity<T> extends BaseCoreEntity<T> {
    private Long id;

    public BaseEntity() {
    }

    public BaseEntity(Long id) {
        this.id = id;
    }
}
