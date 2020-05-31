package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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