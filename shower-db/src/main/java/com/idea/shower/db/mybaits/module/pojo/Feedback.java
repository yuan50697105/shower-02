package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户反馈
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Feedback extends BaseDbEntity implements Serializable {
    /**
     * 用户ID
     */
    private Long customerId;

    /**
     * 反馈标题
     */
    private String title;

    /**
     * 反馈内容
     */
    private String content;

    /**
     * 反馈图片路径
     */
    private String image;

    /**
     * 官方回复状态
     */
    private Integer respondStatus;

    /**
     * 官方回复内容
     */
    private String respondContent;

    /**
     * 官方回复时间
     */
    private Date respondTime;

    private static final long serialVersionUID = 1L;
}