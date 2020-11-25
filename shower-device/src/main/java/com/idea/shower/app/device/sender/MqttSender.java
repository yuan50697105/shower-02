package com.idea.shower.app.device.sender;

import cn.hutool.core.codec.Base64;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.iot.model.v20180120.PubRequest;
import com.aliyuncs.iot.model.v20180120.PubResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.idea.shower.app.device.properties.DeviceListenerProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-19 22:36
 */
@SuppressWarnings("FieldMayBeFinal")
@Component
@Slf4j
public class MqttSender {
    @Autowired
    private DeviceListenerProperties properties;

    public PubResponse send(String productKey, String topic, String object) {
//        DefaultProfile profile = DefaultProfile.getProfile(properties.getRegionId(),properties.getAccessKey(), properties.getAccessSecret());
//        IAcsClient client = new DefaultAcsClient(profile);
        DefaultProfile profile = DefaultProfile.getProfile(properties.getRegionId(), properties.getAccessKey(), properties.getAccessSecret());
        IAcsClient client = new DefaultAcsClient(profile);
        PubRequest request = new PubRequest();
        request.setQos(0);
//设置发布消息的topic。
        request.setTopicFullName(topic);
        request.setProductKey(productKey);
//设置消息的内容，一定要用base64编码，否则乱码。
        request.setMessageContent(Base64.encode(object));
        try {
            return client.getAcsResponse(request);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}