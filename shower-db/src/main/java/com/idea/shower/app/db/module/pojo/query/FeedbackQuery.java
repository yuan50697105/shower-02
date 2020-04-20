package com.idea.shower.app.db.module.pojo.query;

import com.idea.shower.app.db.commons.pojo.BaseDbQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author wcq
 * @title: FeedbackQurey
 * @projectName shower-01
 * @date 2020/4/1610:00
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class FeedbackQuery extends BaseDbQuery {
    /**
     * 用户ID
     */
    private Long customerId;

    private Integer respondStatus;

    private Integer page;
    private Integer limit;
}
