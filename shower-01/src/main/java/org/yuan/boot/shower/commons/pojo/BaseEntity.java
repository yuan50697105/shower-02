package org.yuan.boot.shower.commons.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
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
@Accessors(chain = true)
public class BaseEntity extends AbstractBaseEntity {
    @Id
    private Long id;


}