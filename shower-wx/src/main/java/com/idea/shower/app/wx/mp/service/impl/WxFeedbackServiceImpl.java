package com.idea.shower.app.wx.mp.service.impl;

import com.idea.shower.app.db.module.dao.FeedbackDao;
import com.idea.shower.app.db.module.pojo.Feedback;
import com.idea.shower.app.db.module.pojo.query.FeedbackQuery;
import com.idea.shower.app.wx.mp.pojo.WxFeedbackDTO;
import com.idea.shower.app.wx.mp.service.WxFeedbackService;
import com.idea.shower.db.core.pojo.IWxPageResult;
import com.idea.shower.web.webmvc.exception.ResultRuntimeException;
import com.idea.shower.web.webmvc.pojo.Result;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

/**
 * @author wcq
 * @title: WxFeedbackServiceImpl
 * @projectName shower-01
 * @date 2020/4/1610:45
 */
@Service
@AllArgsConstructor
@Log4j2
public class WxFeedbackServiceImpl implements WxFeedbackService {
    private final FeedbackDao feedbackDao;

    /**
     * 添加反馈信息
     *
     * @param wxFeedbackDTO 反馈信息封装
     * @return 信息
     */
    @Override
    public Result addFeedback(WxFeedbackDTO wxFeedbackDTO) {
        try {
            Feedback feedback = new Feedback();
            feedbackDao.save(feedback);
        }catch (Exception e){
            log.error(e.getMessage());
            throw new ResultRuntimeException(ResultUtils.dataParamsError("提交失败"));
        }
        return ResultUtils.data("success");
    }

    /**
     * 分页查询
     *
     * @param condition 条件
     * @return
     */
    @Override
    public Result selectPage(FeedbackQuery condition) {
        IWxPageResult<Feedback> pageResult = feedbackDao.selectPageByConditionWeXin(condition);
        return ResultUtils.data(pageResult);
    }
}
