package org.yuan.boot.webmvc.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.db.core.pojo.BaseCoreEntity;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public abstract class BaseEntity<T> extends BaseCoreEntity<T> {
    @Id
    private Long id;

    public BaseEntity() {
    }

    public BaseEntity(Long id) {
        this.id = id;
    }

}
