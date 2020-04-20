package com.idea.shower.app.wx.mp.service;

import com.idea.shower.app.db.module.pojo.query.FeedbackQuery;
import com.idea.shower.app.wx.mp.pojo.WxFeedbackDTO;
import com.idea.shower.web.webmvc.pojo.Result;

/**
 * @author wcq
 * @title: WxFeedbackService
 * @projectName shower-01
 * @date 2020/4/1610:45
 */
public interface WxFeedbackService {
    /**
     * 添加反馈
     *
     * @param wxFeedbackDTO 添加反馈
     * @return 处理结果
     */
    Result addFeedback(WxFeedbackDTO wxFeedbackDTO);

    /**
     * 个人反馈信息
     *
     * @param condition 条件
     * @return 反馈信息
     */
    Result selectPage(FeedbackQuery condition);
}
