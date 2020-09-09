package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.util.Date;

/**
 * 区域信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AreaInfo extends BaseDbEntity {
    /**
     * id
     */
    private Long id;

    /**
     * createTime
     */
    private Date createDate;

    /**
     * updateTime
     */
    private Date updateDate;

    /**
     * createUser
     */
    private Long creator;

    /**
     * updateUser
     */
    private Long updater;

    private String delFlag;

    /**
     * 区域名称
     */
    private String name;

    /**
     * 区域编号
     */
    private String code;
}