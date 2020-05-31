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
    * 文件存储表
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowerStorage extends BaseDbEntity implements Serializable {
    /**
    * 文件的唯一索引
    */
    private String key;

    /**
    * 文件名
    */
    private String name;

    /**
    * 文件类型
    */
    private String type;

    /**
    * 文件大小
    */
    private Integer size;

    /**
    * 文件访问链接
    */
    private String url;

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