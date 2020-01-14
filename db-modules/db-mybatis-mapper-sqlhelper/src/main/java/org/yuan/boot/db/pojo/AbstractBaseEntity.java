package org.yuan.boot.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.MappedSuperclass;

@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public class AbstractBaseEntity<T> extends AbstractCoreEntity<T> {

}
