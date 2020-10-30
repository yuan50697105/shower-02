package com.idea.shower.db.mybaits.commons.pojo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.idea.shower.db.mybaits.commons.interceptor.annotation.*;
import io.renren.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.Map;

/**
 * @program: shower-01
 * @description: 数据表基础实体
 * @author: yuane
 * @create: 2020-01-20 16:24
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseDbEntity extends BaseEntity {
    @Id
    @TableId
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    @CreateUser
    private Long creator;
    @UpdateUser
    private Long updater;
    @CreateTime
    private Date createDate;
    @UpdateTime
    private Date updateDate;
    @TableLogic(delval = "1", value = "0")
    private String delFlag;


    public void copyFromByOptions(BaseDbEntity t, CopyOptions copyOptions) {
        BeanUtil.copyProperties(t, this, copyOptions);
    }

    public void copyFromByOptions(Map<?, ?> map, CopyOptions copyOptions) {
        BeanUtil.fillBeanWithMap(map, this, copyOptions);
    }

    public void copyFrom(BaseDbEntity t, String... ignoreProperties) {
        copyFromByOptions(t, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }

    public void copyFrom(Map<?, ?> map, String... ignoreProperties) {
        copyFromByOptions(map, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }
}