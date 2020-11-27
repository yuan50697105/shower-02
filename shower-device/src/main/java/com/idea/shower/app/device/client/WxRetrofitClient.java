package com.idea.shower.app.device.client;

import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitClient;
import com.idea.shower.commons.pojo.Result;
import com.idea.shower.commons.pojo.WxUseOrderRequest;
import org.springframework.stereotype.Component;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-27 22:30
 */
@Component
@RetrofitClient(baseUrl = "${wx.terminal.url}")
public interface WxRetrofitClient {
    @POST("wx/order/end")
    Response<Result> endOrder(@Body WxUseOrderRequest request);
}
