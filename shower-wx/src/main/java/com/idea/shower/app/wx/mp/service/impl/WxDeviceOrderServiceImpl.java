package com.idea.shower.app.wx.mp.service.impl;

import com.idea.shower.app.wx.mp.client.DeviceRetrofitClient;
import com.idea.shower.app.wx.mp.pojo.properties.DeviceTerminalProperties;
import com.idea.shower.app.wx.mp.service.WxDeviceOrderService;
import com.idea.shower.commons.pojo.dto.DeviceOrderDto;
import com.idea.shower.commons.pojo.dto.Result;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import retrofit2.Response;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-26 21:16
 */
@Service
@Transactional
public class WxDeviceOrderServiceImpl implements WxDeviceOrderService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DeviceTerminalProperties properties;
    @Autowired
    private DeviceRetrofitClient deviceRetrofitClient;

    @SneakyThrows
    @Override
    public Result addOrder(DeviceOrderDto deviceOrderDto) {
//        String deviceTerminalUrl = properties.getDeviceTerminalUrl();
//        deviceTerminalUrl = deviceTerminalUrl.replace("/$", "");
//        String url = deviceTerminalUrl + "/device/process/order/add";
//        return restTemplate.postForObject(url, deviceOrderDto, Result.class);
//        return restTemplate.postForEntity(url, null, Result.class, BeanUtil.beanToMap(deviceOrderDto)).getBody();
        Response<Result> string = deviceRetrofitClient.addOrder(deviceOrderDto);
        return string.body();
    }
}