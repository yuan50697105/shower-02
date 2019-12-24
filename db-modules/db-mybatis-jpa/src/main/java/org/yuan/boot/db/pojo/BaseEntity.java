package org.yuan.boot.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.core.BaseCoreEntity;

import javax.persistence.MappedSuperclass;

@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public abstract class BaseEntity<T> extends BaseCoreEntity<T> {
    private Long id;

    public BaseEntity() {
    }

    public BaseEntity(Long id) {
        this.id = id;
    }

}
