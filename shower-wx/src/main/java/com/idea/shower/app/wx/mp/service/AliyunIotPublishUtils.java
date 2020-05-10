package com.idea.shower.app.wx.mp.service;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.iot.model.v20180120.PubRequest;
import com.aliyuncs.iot.model.v20180120.PubResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.idea.shower.web.webmvc.exception.ResultRuntimeException;
import com.idea.shower.web.webmvc.pojo.Result;
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

    public static void main(String[] args) {
        final String productKey = "a12mkmuZtyi";
        final String deviceName = "test_1";
        final String deviceSecret = "BQ4k3KQXt2ceNY032zxJ2hXjc6YBtvOX";
        String regionId = "cn-shanghai";
        String accessKey = "LTAI4G1NSa1oinSKH6xwBcgm";
        String accessSecret = "sMWMGOTnC0Pebux3tW3BSwUN4Cb6IY";
        //设置client的参数
        DefaultProfile profile = DefaultProfile.getProfile(regionId, accessKey, accessSecret);
        IAcsClient client = new DefaultAcsClient(profile);

        PubRequest request = new PubRequest();
        request.setQos(0);
        //设置发布消息的topic
        request.setTopicFullName("/" + productKey + "/" + deviceName + "/user/control");
        request.setProductKey(productKey);
        //设置消息的内容，一定要用base64编码，否则乱码
        request.setMessageContent(Base64.encode("{1234,57}"));
        try {
            PubResponse response = client.getAcsResponse(request);
            System.out.println("pub success?:" + response.getSuccess());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public PubResponse sendAndResponse(PubRequest request) {
        DefaultProfile profile = DefaultProfile.getProfile(regionId, accessKey, accessSecret);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        PubResponse response;
        try {
            response = client.getAcsResponse(request);
            System.out.println("pub success?:" + response.getSuccess());
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

    public boolean open(String productKey,String deviceName){
        return sendAndResponse("/" + productKey + "/" + deviceName + "/user/control", productKey, "{1234,57}");
    }

    public boolean close(String productKey,String deviceName){
        return sendAndResponse("/" + productKey + "/" + deviceName + "/user/control", productKey, "{1234,56}");
    }
}
