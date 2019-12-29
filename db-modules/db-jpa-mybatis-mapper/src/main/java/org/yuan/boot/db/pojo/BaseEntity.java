package org.yuan.boot.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.MappedSuperclass;

@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public abstract class BaseEntity<T> extends CoreEntity<T> {

}
