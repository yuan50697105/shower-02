package com.idea.shower.app.wx.mp.client;

import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitClient;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-25 22:12
 */
@RetrofitClient(baseUrl = "${device.terminal.device-terminal-url}")
public interface DeviceRetrofitClient {

}
