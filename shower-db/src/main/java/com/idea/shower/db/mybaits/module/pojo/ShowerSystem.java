package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
    * 系统配置表
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowerSystem extends BaseDbEntity implements Serializable {
    /**
    * 系统配置名
    */
    private String keyName;

    /**
    * 系统配置值
    */
    private String keyValue;

    /**
    * 创建时间
    */
    private Date addTime;

    /**
    * 逻辑删除
    */
    private Boolean deleted;

    private static final long serialVersionUID = 1L;
}