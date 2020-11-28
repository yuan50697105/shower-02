package org.yuan;

import com.idea.shower.app.wx.ShowerWxApplication;
import com.idea.shower.app.wx.mp.rabbitmq.sender.DeviceOrderInfoSender;
import com.idea.shower.app.wx.mp.service.WxDeviceOrderService;
import com.idea.shower.commons.pojo.DeviceOrderDto;
import com.idea.shower.commons.pojo.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-05-05 13:55
 */
@SpringBootTest(classes = ShowerWxApplication.class)
public class Test1 {

    @Autowired
    private WxDeviceOrderService deviceOrderService;
    @Autowired
    private DeviceOrderInfoSender deviceOrderInfoSender;

    @Test
    void t2() {
        DeviceOrderDto deviceOrderDto = new DeviceOrderDto();
        deviceOrderDto.setOrderNo(UUID.randomUUID().toString().replace("-", ""));
        deviceOrderDto.setDeviceId(3L);
        Result result = deviceOrderService.addOrder(deviceOrderDto);

        System.out.println("result = " + result);
    }

    @Test
    void t3() {
        DeviceOrderDto deviceOrderDto = new DeviceOrderDto();
        deviceOrderDto.setOrderNo(UUID.randomUUID().toString().replace("-", ""));
        deviceOrderDto.setDeviceId(3L);
        deviceOrderInfoSender.addOrder(deviceOrderDto);

    }
}