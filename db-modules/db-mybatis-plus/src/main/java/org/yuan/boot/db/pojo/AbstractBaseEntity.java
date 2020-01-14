package org.yuan.boot.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AbstractBaseEntity<T> extends AbstractCoreEntity<T> {

}
