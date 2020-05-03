package com.idea.shower.app.device.consumer;

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
import com.idea.shower.amqp.configuration.QueueConstants;
import com.idea.shower.amqp.module.pojo.AmqpDeviceInfo;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-09 20:51
 */
@Component
@RabbitListener(queues = QueueConstants.TOPIC_OPEN_ROOM)
public class DeviceOrderConsumer {
    @RabbitHandler
    public Object openRoom(AmqpDeviceInfo amqpDeviceInfo) {
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
        Map<String, ValueWrapper> propertyValues = new HashMap<String, ValueWrapper>();

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
                //设置pub消息的topic和内容
                MqttPublishRequest request = new MqttPublishRequest();
                request.topic = "/" + productKey + "/" + deviceName + "/user/control";
                request.qos = 0;
                request.payloadObj = convertPayloadObj(amqpDeviceInfo);
                //发送消息并设置成功以后的回调
                LinkKit.getInstance().publish(request, new IConnectSendListener() {
                    @Override
                    public void onResponse(ARequest aRequest, AResponse aResponse) {
                        System.out.println("onResponse:" + aResponse.getData());
                    }

                    @Override
                    public void onFailure(ARequest aRequest, AError aError) {
                        System.out.println("onFailure:" + aError.getCode() + aError.getMsg());
                    }
                });
            }

            private Object convertPayloadObj(AmqpDeviceInfo amqpDeviceInfo) {
                Object[] objects = new Object[3];
                objects[0] = amqpDeviceInfo.getDeviceCode();
                objects[1] = amqpDeviceInfo.getStatus().getCode();
                return objects;
            }

        });
        return null;

    }
}