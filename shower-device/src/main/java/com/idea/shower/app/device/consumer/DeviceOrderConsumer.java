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
import org.springframework.boot.CommandLineRunner;
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
public class DeviceOrderConsumer implements CommandLineRunner {
    @RabbitHandler
    public Object openRoom(AmqpDeviceInfo amqpDeviceInfo) {

        return null;

    }

    @Override
    public void run(String... args) throws Exception {

    }
}