package com.idea.shower.app.device;

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
import com.idea.shower.amqp.module.pojo.AmqpDeviceInfo;
import com.idea.shower.app.db.ShowerDbApplication;
import com.idea.shower.web.webmvc.WebMvcCoreApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication(scanBasePackageClasses = {ShowerDeviceApplication.class, ShowerDbApplication.class, WebMvcCoreApplication.class})
@Slf4j
public class ShowerDeviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShowerDeviceApplication.class, args);
    }


    @Bean
    CommandLineRunner runner() {
        return new CommandLineRunner() {
            private Object convertPayloadObj(AmqpDeviceInfo amqpDeviceInfo) {
                Object[] objects = new Object[3];
                objects[0] = amqpDeviceInfo.getDeviceCode();
                objects[1] = amqpDeviceInfo.getStatus().getCode();
                return objects;
            }
            @Override
            public void run(String... args) throws Exception {
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
                        request.payloadObj = convertPayloadObj(amqpDeviceInfo);


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
        };
    }
}
