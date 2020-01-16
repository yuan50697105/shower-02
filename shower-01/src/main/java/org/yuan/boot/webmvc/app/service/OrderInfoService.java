package org.yuan.boot.webmvc.app.service;

import org.yuan.boot.webmvc.app.pojo.vo.OrderInfoVo;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-14 21:53
 */
public interface OrderInfoService {
    Result add(OrderInfoVo orderInfoVo);

    Result prepay(OrderInfoVo orderInfoVo);

}
