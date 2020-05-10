package org.yuan;

import com.idea.shower.app.wx.ShowerWxApplication;
import com.idea.shower.app.wx.mp.service.WxDeviceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-05-05 13:55
 */
@SpringBootTest(classes = ShowerWxApplication.class)
public class Test1 {
    @Autowired
    private WxDeviceService wxDeviceService;
    @Test
    void t1() {
        wxDeviceService.openRoom2(3L);
        wxDeviceService.closeRoom(3L);
    }
}