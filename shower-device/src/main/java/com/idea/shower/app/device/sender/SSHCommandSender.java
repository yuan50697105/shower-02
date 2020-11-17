package com.idea.shower.app.device.sender;

import com.aliyun.oss.ClientException;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.iot.model.v20180120.RRpcRequest;
import com.aliyuncs.iot.model.v20180120.RRpcResponse;
import com.idea.shower.app.device.client.OpenApiClient;
import com.idea.shower.app.device.properties.DeviceListenerProperties;
import lombok.SneakyThrows;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.rmi.ServerException;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-17 22:39
 */
@Component
public class SSHCommandSender {
    @Autowired
    private DeviceListenerProperties properties;

    // ===================需要填写的参数开始===========================

    // 用户账号AccessKey

//    private static String accessKeyID = "";
//
//    // 用户账号AccesseKeySecret
//
//    private static String accessKeySecret = "";
//
//    // 产品Key
//
//    private static String productKey = "";

    // 设备名称deviceName


    // ===================需要填写的参数结束===========================


    @SneakyThrows
    public void send(String deviceName, String payload) throws ServerException, ClientException, UnsupportedEncodingException {


        // linux 远程命令

//        String payload = "uname -a";


        // 构建RRPC请求

        RRpcRequest request = new RRpcRequest();

        request.setProductKey(properties.getProductKey());

        request.setDeviceName(deviceName);

        request.setRequestBase64Byte(Base64.encodeBase64String(payload.getBytes()));

        request.setTimeout(5000);


        // 获取服务端请求客户端

        DefaultAcsClient client = OpenApiClient.getClient(properties.getAccessKey(), properties.getAccessSecret());


        // 发起RRPC请求

        RRpcResponse response = (RRpcResponse) client.getAcsResponse(request);


        // RRPC响应处理

        // response.getSuccess()仅表明RRPC请求发送成功，不代表设备接收成功和响应成功

        // 需要根据RrpcCode来判定，参考文档https://help.aliyun.com/document_detail/69797.html

        if (response != null && "SUCCESS".equals(response.getRrpcCode())) {

            // 回显

            System.out.println(new String(Base64.decodeBase64(response.getPayloadBase64Byte()), "UTF-8"));

        } else {

            // 回显失败，打印rrpc code

            System.out.println(response.getRrpcCode());

        }

    }


}
