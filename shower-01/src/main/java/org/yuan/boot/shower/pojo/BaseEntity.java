package org.yuan.boot.shower.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.pojo.AbstractBaseEntity;
import org.yuan.boot.shower.interceptor.annotation.CreateTime;
import org.yuan.boot.shower.interceptor.annotation.Id;
import org.yuan.boot.shower.interceptor.annotation.UpdateTime;

import java.util.Date;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-05 00:13
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseEntity<T> extends AbstractBaseEntity<T> {
    @Id
    private Long id;
    private String createUser;
    @CreateTime
    private Date createTime;
    private String updateUser;
    @UpdateTime
    private Date updateTIme;

}