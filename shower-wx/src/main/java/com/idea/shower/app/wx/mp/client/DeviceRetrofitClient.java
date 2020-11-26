package com.idea.shower.app.wx.mp.client;

import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitClient;
import com.idea.shower.commons.pojo.dto.DeviceOrderDto;
import com.idea.shower.commons.pojo.dto.Result;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-25 22:12
 */
@Component
@RetrofitClient(baseUrl = "${device.terminal.device-terminal-url}")
public interface DeviceRetrofitClient {
    @POST("/device/process/order/add")
    Result addOrder(@Body DeviceOrderDto deviceOrderDto);
}
