package org.yuan.boot.db.jpa.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.pojo.AbstractCoreEntity;

import javax.persistence.MappedSuperclass;

@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public abstract class AbstractBaseEntity<T> extends AbstractCoreEntity<T> {

}
