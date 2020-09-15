package com.idea.shower.db.mybaits.commons.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.idea.shower.db.mybaits.commons.interceptor.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @program: shower-01
 * @description: 数据表基础实体
 * @author: yuane
 * @create: 2020-01-20 16:24
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseDbEntity extends com.idea.shower.db.mybaits.base.pojo.BaseDbEntity {
    @Id
    @TableId
    private Long id;
    @CreateUser
    private String creator;
    @UpdateUser
    private String updater;
    @CreateTime
    private Date createDate;
    @UpdateTime
    private Date updateDate;
    @TableLogic(delval = "1", value = "0")
    private String delFlag;


}