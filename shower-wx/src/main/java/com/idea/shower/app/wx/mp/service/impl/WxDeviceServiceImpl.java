package com.idea.shower.app.wx.mp.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.aliyun.alink.dm.api.DeviceInfo;
import com.aliyun.alink.dm.api.InitResult;
import com.aliyun.alink.linkkit.api.ILinkKitConnectListener;
import com.aliyun.alink.linkkit.api.IoTMqttClientConfig;
import com.aliyun.alink.linkkit.api.LinkKit;
import com.aliyun.alink.linkkit.api.LinkKitInitParams;
import com.aliyun.alink.linksdk.cmp.connect.channel.MqttPublishRequest;
import com.aliyun.alink.linksdk.cmp.core.base.ARequest;
import com.aliyun.alink.linksdk.cmp.core.base.AResponse;
import com.aliyun.alink.linksdk.cmp.core.listener.IConnectSendListener;
import com.aliyun.alink.linksdk.tmp.device.payload.ValueWrapper;
import com.aliyun.alink.linksdk.tools.AError;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.iot.model.v20180120.RRpcRequest;
import com.aliyuncs.iot.model.v20180120.RRpcResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.idea.shower.amqp.module.pojo.AmqpDeviceInfo;
import com.idea.shower.app.db.module.dao.DeviceInfoDao;
import com.idea.shower.app.wx.mp.service.WxDeviceService;
import com.idea.shower.web.webmvc.exception.ResultRuntimeException;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-05-05 13:46
 */
@Service
@Slf4j
public class WxDeviceServiceImpl implements WxDeviceService {
    @Autowired
    private DeviceInfoDao deviceInfoDao;

    @SneakyThrows
    @Override
    public void openRoom2(Long deviceId) {
        com.idea.shower.app.db.module.pojo.DeviceInfo deviceInfo = deviceInfoDao.getById(deviceId).orElseThrow(() -> new ResultRuntimeException(ResultUtils.wxDeviceNotFoundError()));
        String code = deviceInfo.getCode();
        code = StrUtil.isEmpty(code) ? "1234" : code;
        String regionId = "cn-shanghai";
        String accessKey = "LTAI4FkQ95YXibFPqXNYEfAS";
        String accessSecret = "CljbqsAeC3p6lROXLNoUeWBJkRO66D";
        final String productKey = "a12mkmuZtyi";
        final String deviceName = "test_1";
        final String deviceSecret = "BQ4k3KQXt2ceNY032zxJ2hXjc6YBtvOX";
        final String region = regionId;
        DefaultProfile.addEndpoint("cn-shanghai", "cn-shanghai", "Iot", "iot.cn-shanghai.aliyuncs.com");
        IClientProfile profile = DefaultProfile.getProfile("cn-shanghai", accessKey, accessSecret);
        DefaultAcsClient client = new DefaultAcsClient(profile); //初始化SDK客户端
        RRpcRequest request = new RRpcRequest();
        request.setProductKey(productKey);
        request.setDeviceName(deviceName);
        request.setTopic("/" + productKey + "/" + deviceName + "/" + "user" + "/" + "control");
        String jsonStr = JSONUtil.toJsonStr(new Object[]{Long.valueOf(code), 57});
        request.setRequestBase64Byte(Base64.getEncoder().encodeToString(jsonStr.getBytes()));
        request.setTimeout(3000);
        RRpcResponse response = client.getAcsResponse(request);
        System.out.println("JSONUtil.toJsonStr(response) = " + JSONUtil.toJsonStr(response));
    }

    @Override
    @SneakyThrows
    public void closeRoom(Long deviceId) {
        com.idea.shower.app.db.module.pojo.DeviceInfo deviceInfo = deviceInfoDao.getById(deviceId).orElseThrow(() -> new ResultRuntimeException(ResultUtils.wxDeviceNotFoundError()));
        String code = deviceInfo.getCode();
        code = StrUtil.isEmpty(code) ? "1234" : code;
        String regionId = "cn-shanghai";
        String accessKey = "LTAI4FkQ95YXibFPqXNYEfAS";
        String accessSecret = "CljbqsAeC3p6lROXLNoUeWBJkRO66D";
        final String productKey = "a12mkmuZtyi";
        final String deviceName = "test_1";
        final String deviceSecret = "BQ4k3KQXt2ceNY032zxJ2hXjc6YBtvOX";
        final String region = regionId;
        DefaultProfile.addEndpoint("cn-shanghai", "cn-shanghai", "Iot", "iot.cn-shanghai.aliyuncs.com");
        IClientProfile profile = DefaultProfile.getProfile("cn-shanghai", accessKey, accessSecret);
        DefaultAcsClient client = new DefaultAcsClient(profile); //初始化SDK客户端
        RRpcRequest request = new RRpcRequest();
        request.setProductKey(productKey);
        request.setDeviceName(deviceName);
        request.setTopic("/" + productKey + "/" + deviceName + "/" + "user" + "/" + "control");
        String jsonStr = JSONUtil.toJsonStr(new Object[]{Long.valueOf(code), 56});
        request.setRequestBase64Byte(Base64.getEncoder().encodeToString(jsonStr.getBytes()));
        request.setTimeout(3000);
        RRpcResponse response = client.getAcsResponse(request);
        System.out.println("JSONUtil.toJsonStr(response) = " + JSONUtil.toJsonStr(response));
    }

    @Override
    @Transactional
    public void openRoom(String deviceCode, String status) {
        log.info("开启房间");
        // TODO: 2020/4/9 发送订单信息到设备
        String regionId = "cn-shanghai";
        String accessKey = "LTAI4FkQ95YXibFPqXNYEfAS";
        String accessSecret = "CljbqsAeC3p6lROXLNoUeWBJkRO66D";
        final String productKey = "a12mkmuZtyi";
        final String deviceName = "test_1";
        final String deviceSecret = "BQ4k3KQXt2ceNY032zxJ2hXjc6YBtvOX";
        final String region = regionId;

        LinkKitInitParams params = new LinkKitInitParams();
        //LinkKit底层是mqtt协议，设置mqtt的配置
        IoTMqttClientConfig config = new IoTMqttClientConfig();
        config.productKey = productKey;
        config.deviceName = deviceName;
        config.deviceSecret = deviceSecret;
        config.channelHost = productKey + ".iot-as-mqtt." + region + ".aliyuncs.com:1883";
        //设备的信息
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.productKey = productKey;
        deviceInfo.deviceName = deviceName;
        deviceInfo.deviceSecret = deviceSecret;
        //报备的设备初始状态，此处没有物模型初始状态
        Map<String, ValueWrapper> propertyValues = new HashMap<>();

        params.mqttClientConfig = config;
        params.deviceInfo = deviceInfo;
        params.propertyValues = propertyValues;
        //连接并设置连接成功以后的回调函数
        LinkKit.getInstance().init(params, new ILinkKitConnectListener() {
            @Override
            public void onError(AError aError) {
                System.out.println("Init error:" + aError);
            }

            //初始化成功以后的回调
            @Override
            public void onInitDone(InitResult initResult) {
                log.info("连接成功");
                //设置pub消息的topic和内容
                MqttPublishRequest request = new MqttPublishRequest();
                request.topic = "/" + productKey + "/" + deviceName + "/user/control";
                request.qos = 0;
                AmqpDeviceInfo amqpDeviceInfo = new AmqpDeviceInfo();
                amqpDeviceInfo.setDeviceCode("1234");
                amqpDeviceInfo.setStatus(AmqpDeviceInfo.DeviceStatus.OPEN);
                request.payloadObj = JSONUtil.toJsonStr(new Object[]{deviceCode, status});


                //发送消息并设置成功以后的回调
                LinkKit.getInstance().publish(request, new IConnectSendListener() {
                    @Override
                    public void onResponse(ARequest aRequest, AResponse aResponse) {
                        log.info("响应事件");
                        System.out.println("onResponse:" + aResponse.getData());
                    }

                    @Override
                    public void onFailure(ARequest aRequest, AError aError) {
                        log.error("连接失败");
                        System.out.println("onFailure:" + aError.getCode() + aError.getMsg());
                    }
                });
            }


        });
    }
}

