package com.idea.shower.app.wx.mp.service;

import lombok.SneakyThrows;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-05-05 13:46
 */
public interface WxDeviceService {


    void openRoom2(Long deviceId);

    void closeRoom(Long deviceId);

    @Transactional
    void openRoom(String deviceCode, String status);
}
