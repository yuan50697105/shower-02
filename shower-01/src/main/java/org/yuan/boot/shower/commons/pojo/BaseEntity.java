package org.yuan.boot.shower.commons.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.pojo.AbstractBaseEntity;
import org.yuan.boot.shower.commons.interceptor.annotation.Id;

/**
 * @program: shower-01
 * @description: 数据表基础实体
 * @author: yuane
 * @create: 2020-01-20 16:24
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseEntity<T> extends AbstractBaseEntity<T> {
    @Id
    private Long id;

    public BaseEntity() {
    }

    public BaseEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @SuppressWarnings("unchecked")
    public T setId(Long id) {
        this.id = id;
        return (T) this;
    }
}