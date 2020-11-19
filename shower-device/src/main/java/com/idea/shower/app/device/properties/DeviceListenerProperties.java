package com.idea.shower.app.device.properties;

import lombok.Data;
import lombok.SneakyThrows;
import org.apache.commons.codec.binary.Base64;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.UUID;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-17 22:16
 */
@ConfigurationProperties(prefix = "device.listener")
@Data
public class DeviceListenerProperties {
    private String regionId = "cn-shanghai";
    private String accessKey = "LTAI4G1NSa1oinSKH6xwBcgm";
    private String accessSecret = "sMWMGOTnC0Pebux3tW3BSwUN4Cb6IY";
    private String consumerGroupId = "P3cswVgmUE5zwq53V6YI000100";
    private String productKey = "";
    private String signMethod = "hmacsha1";
    private String clientId = UUID.randomUUID().toString();
    private String iotInstanceId = "";
    private Long timeStamp = System.currentTimeMillis();
    private String connectionUrl = "failover:(amqps://278838153679110135.iot-amqp.cn-shanghai.aliyuncs.com:5671?amqp.idleTimeout=80000)"
            + "?failover.reconnectDelay=30";

    public String getUserName() {
        return clientId + "|authMode=aksign"
                + ",signMethod=" + signMethod
                + ",timestamp=" + timeStamp
                + ",authId=" + accessKey
//                + ",iotInstanceId=" + iotInstanceId //如果是购买的实例，需要传实例ID
                + ",consumerGroupId=" + consumerGroupId
                + "|";
    }


    public String signContent() {
        return "authId=" + accessKey + "&timestamp=" + timeStamp;
    }

    @SneakyThrows
    public String password() {
        return doSign(signContent(), accessSecret, signMethod);
    }

    private String doSign(String toSignString, String secret, String signMethod) throws Exception {
        SecretKeySpec signingKey = new SecretKeySpec(secret.getBytes(), signMethod);
        Mac mac = Mac.getInstance(signMethod);
        mac.init(signingKey);
        byte[] rawHmac = mac.doFinal(toSignString.getBytes());
        return Base64.encodeBase64String(rawHmac);
    }
}