package com.idea.shower.app.wx.mp.util;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.iot.model.v20180120.PubRequest;
import com.aliyuncs.iot.model.v20180120.PubResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.idea.shower.web.webmvc.exception.ResultRuntimeException;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.internal.websocket.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AliyunIotPublishUtils {

    @Value("${aliyun.access-key}")
    private String accessKey;
    @Value("${aliyun.access-secret}")
    private String accessSecret;
    @Value("${aliyun.region-id}")
    private String regionId;


    public PubResponse sendAndResponse(PubRequest request) {
        DefaultProfile profile = DefaultProfile.getProfile(regionId, accessKey, accessSecret);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        PubResponse response;
        try {
            response = client.getAcsResponse(request);
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ResultRuntimeException(ResultUtils.systemError());
        }
        return response;
    }

    public boolean sendAndResponse(String topic, String productKey, String content) {
        PubRequest request = new PubRequest();
        request.setTopicFullName(topic);
        request.setProductKey(productKey);
        request.setMessageContent(Base64.encode(content));
        PubResponse pubResponse = sendAndResponse(request);
        return pubResponse.getSuccess();
    }

    /**
     * 设备解锁
     * @param productKey 产品号
     * @param deviceName 设备号
     */
    public void open(String productKey, String deviceName) {
        sendAndResponse("/" + productKey + "/" + deviceName + "/user/control", productKey, "{" + deviceName + ",57}");
    }

    /**
     * 设备上锁
     * @deprecated
     * @param productKey
     * @param deviceName
     * @return
     */
    @Deprecated
    public boolean close(String productKey, String deviceName) {
        return sendAndResponse("/" + productKey + "/" + deviceName + "/user/control", productKey, "{" + deviceName + ",56}");
    }
}
