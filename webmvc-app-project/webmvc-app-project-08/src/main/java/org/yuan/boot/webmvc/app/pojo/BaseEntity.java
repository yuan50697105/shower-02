package org.yuan.boot.webmvc.app.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.yuan.boot.webmvc.app.configuration.SnowFlakeIdGenerator;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 14:20
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity<T> extends org.yuan.boot.db.pojo.BaseEntity<T> {
    @TableId(type = IdType.NONE)
    @Id
    @KeySql(genId = SnowFlakeIdGenerator.class)
    private Long id;

    @SuppressWarnings("unchecked")
    public T setId(Long id) {
        this.id = id;
        return (T) this;
    }
}