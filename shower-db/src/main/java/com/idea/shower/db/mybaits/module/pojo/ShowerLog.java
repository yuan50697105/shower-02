package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
    * 操作日志表
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowerLog extends BaseDbEntity implements Serializable {
    /**
    * 管理员
    */
    private String admin;

    /**
    * 管理员地址
    */
    private String ip;

    /**
    * 操作分类
    */
    private Integer type;

    /**
    * 操作动作
    */
    private String action;

    /**
    * 操作状态
    */
    private Boolean status;

    /**
    * 操作结果，或者成功消息，或者失败消息
    */
    private String result;

    /**
    * 补充信息
    */
    private String comment;

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