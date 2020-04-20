package com.idea.shower.app.wx.mp.controller;

import com.idea.shower.app.db.module.pojo.query.FeedbackQuery;
import com.idea.shower.app.wx.mp.pojo.WxFeedbackDTO;
import com.idea.shower.app.wx.mp.service.WxFeedbackService;
import com.idea.shower.web.webmvc.controller.ResultController;
import com.idea.shower.web.webmvc.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wcq
 * @title: WxFeedbackController
 * @projectName shower-01
 * @date 2020/4/1610:44
 */
@RestController
@RequestMapping("wx/feedback")
@AllArgsConstructor
public class WxFeedbackController extends ResultController {
    private WxFeedbackService wxFeedbackService;

     /**
      * @Author finch
      * @Description 查询
      * @Date 11:07 2020/4/16
      **/
    @PostMapping("data")
    public Result data(@RequestBody FeedbackQuery condition) {
        return wxFeedbackService.selectPage(condition);
    }

     /**
      * @Author finch
      * @Description 添加
      * @Date 11:07 2020/4/16
      **/
    @PostMapping("add")
    public Result add(@RequestBody WxFeedbackDTO wxFeedbackDTO) {
        return wxFeedbackService.addFeedback(wxFeedbackDTO);
    }
}
