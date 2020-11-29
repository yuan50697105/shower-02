package com.idea.shower.app.device.client;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-17 22:37
 */
public class OpenApiClient {

    private static DefaultAcsClient client = null;

    public static DefaultAcsClient getClient(String accessKeyID, String accessKeySecret) {

        if (client != null) {
            return client;
        }

        try {
            IClientProfile profile = DefaultProfile.getProfile("cn-shanghai", accessKeyID, accessKeySecret);
            DefaultProfile.addEndpoint("cn-shanghai", "cn-shanghai", "Iot", "iot.cn-shanghai.aliyuncs.com");
            client = new DefaultAcsClient(profile);
        } catch (Exception e) {
            System.out.println("create Open API Client failed !! exception:" + e.getMessage());
        }

        return client;
    }

}