package com.idea.shower.app.commons.pojo;

import com.idea.shower.db.mybaits.pojo.BaseDbEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.idea.shower.app.commons.db.commons.interceptor.annotation.*;

import java.util.Date;

/**
 * @program: shower-01
 * @description: 数据表基础实体
 * @author: yuane
 * @create: 2020-01-20 16:24
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class BaseEntity extends BaseDbEntity {
    @Id
    private Long id;
    @CreateTime
    private Date createTime;
    @UpdateTime
    private Date updateTime;
    @CreateUser
    private String createUser;
    @UpdateUser
    private String updateUser;


}