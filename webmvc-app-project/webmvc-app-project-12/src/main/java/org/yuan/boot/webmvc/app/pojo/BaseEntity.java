package org.yuan.boot.webmvc.app.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.yuan.boot.webmvc.app.configuration.SnowFlakeIdGenerator;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 14:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity<T> extends org.yuan.boot.db.pojo.BaseEntity<T> {
    @Id
    @GeneratedValue(generator = "org.yuan.boot.webmvc.app.configuration.SnowFlakeIdGenerator")
    @KeySql(genId = SnowFlakeIdGenerator.class)
    private Long id;

    @SuppressWarnings("unchecked")
    public T setId(Long id) {
        this.id = id;
        return (T) this;
    }
}