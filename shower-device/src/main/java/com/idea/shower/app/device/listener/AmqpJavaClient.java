package com.idea.shower.app.device.listener;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.apache.qpid.jms.JmsConnection;
import org.apache.qpid.jms.JmsConnectionListener;
import org.apache.qpid.jms.message.JmsInboundMessageDispatch;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.lang.IllegalStateException;
import java.net.URI;
import java.util.Hashtable;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class AmqpJavaClient {

    private final JmsConnectionListener myJmsConnectionListener = new JmsConnectionListener() {
        /**
         * 连接成功建立
         */
        @Override
        public void onConnectionEstablished(URI remoteURI) {
            log.info("onConnectionEstablished, remoteUri:{}", remoteURI);
        }

        /**
         * 尝试过最大重试次数之后，最终连接失败。
         */
        @Override
        public void onConnectionFailure(Throwable error) {
            log.error("onConnectionFailure, {}", error.getMessage());
        }

        /**
         * 连接中断。
         */
        @Override
        public void onConnectionInterrupted(URI remoteURI) {
            log.info("onConnectionInterrupted, remoteUri:{}", remoteURI);
        }

        /**
         * 连接中断后又自动重连上。
         */
        @Override
        public void onConnectionRestored(URI remoteURI) {
            log.info("onConnectionRestored, remoteUri:{}", remoteURI);
        }

        @Override
        public void onInboundMessage(JmsInboundMessageDispatch envelope) {
        }

        @Override
        public void onSessionClosed(Session session, Throwable cause) {
        }

        @Override
        public void onConsumerClosed(MessageConsumer consumer, Throwable cause) {
        }

        @Override
        public void onProducerClosed(MessageProducer producer, Throwable cause) {
        }
    };
    //业务处理异步线程池，线程池参数可以根据您的业务特点调整；或者您也可以用其他异步方式处理接收到的消息
    private final ExecutorService executorService = new ThreadPoolExecutor(
            Runtime.getRuntime().availableProcessors(),
            Runtime.getRuntime().availableProcessors() * 2, 60, TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(50000));
    private final MessageListener messageListener = new MessageListener() {
        @Override
        public void onMessage(Message message) {
            try {
                //1.收到消息之后一定要ACK
                // 推荐做法：创建Session选择Session.AUTO_ACKNOWLEDGE，这里会自动ACK。
                // 其他做法：创建Session选择Session.CLIENT_ACKNOWLEDGE，这里一定要调message.acknowledge()来ACK。
                // message.acknowledge();
                //2.建议异步处理收到的消息，确保onMessage函数里没有耗时逻辑。
                // 如果业务处理耗时过程过长阻塞住线程，可能会影响SDK收到消息后的正常回调。
                processMessage(message);
                executorService.submit(() -> processMessage(message));
            } catch (Exception e) {
                log.error("submit task occurs exception ", e);
            }
        }
    };

    public static void main(String[] args) {
        System.out.println("JSONUtil.toJsonStr(\"/a12mkmuZtyi/${deviceName}/user/contro\".split(\"/\")) = " + JSONUtil.toJsonStr("/a12mkmuZtyi/${deviceName}/user/contro".split("/")));
    }

    /**
     * 在这里处理您收到消息后的具体业务逻辑。
     */
    private void processMessage(Message message) {
        try {
            byte[] body = message.getBody(byte[].class);
            String content = new String(body);
            String topic = message.getStringProperty("topic");
            String messageId = message.getStringProperty("messageId");
            log.info("receive message"
                    + ", topic = " + topic
                    + ", messageId = " + messageId
                    + ", content = " + content);
            String[] strings = topic.split("/");
            String productKey = strings[1];
            String deviceName = strings[2];
            String user = strings[3];
            String topic0 = strings[4];
            JSONArray objects;
            Long deviceId;
            Long status;
            Double lat;
            Double longa;
            Double waterTemp01;
            Double waterTemp02;
            Double waterAmount01;
            Double waterAmount02;
            Integer lightingCount;
            Double waterUse;
            Double waterSpeed01;
            Double waterSpeed02;
            Integer waterOpen;
            Integer totalServiceTime;
            switch (topic0) {
//                心跳维持
                case "heartbeat":
                    objects = JSONUtil.parseArray(content);
                    deviceId = (Long) objects.get(0);
                    status = (Long) objects.get(1);
                    lat = (Double) objects.get(2);
                    longa = (Double) objects.get(3);
                    waterTemp01 = (Double) objects.get(4);
//                    waterTemp02 = (Double) objects.get(5);
                    waterAmount01 = (Double) objects.get(6);
//                    waterAmount02 = (Double) objects.get(7);
                    lightingCount = (Integer) objects.get(8);
                    waterUse = (Double) objects.get(9);
                    break;
//                    工作状态
                case "work":
                    objects = JSONUtil.parseArray(content);
                    deviceId = (Long) objects.get(0);
                    status = (Long) objects.get(1);
                    waterSpeed01 = (Double) objects.get(2);
//                    waterSpeed02 = (Double) objects.get(3);
                    lightingCount = (Integer) objects.get(4);
                    waterOpen = (Integer) objects.get(5);
                    totalServiceTime = (Integer) objects.get(6);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + topic0);
            }
        } catch (Exception e) {
            log.error("processMessage occurs error ", e);
        }
    }

    /**
     * password签名计算方法，请参见上一篇文档：AMQP客户端接入说明。
     */
    private String doSign(String toSignString, String secret, String signMethod) throws Exception {
        SecretKeySpec signingKey = new SecretKeySpec(secret.getBytes(), signMethod);
        Mac mac = Mac.getInstance(signMethod);
        mac.init(signingKey);
        byte[] rawHmac = mac.doFinal(toSignString.getBytes());
        return Base64.encodeBase64String(rawHmac);
    }

    @PostConstruct
    public void init() throws Exception {
        //参数说明，请参见上一篇文档：AMQP客户端接入说明。
        String accessKey = "LTAI4G1NSa1oinSKH6xwBcgm";
        String accessSecret = "sMWMGOTnC0Pebux3tW3BSwUN4Cb6IY";
        String consumerGroupId = "P3cswVgmUE5zwq53V6YI000100";
        String iotInstanceId = "${iotInstanceId}";
        long timeStamp = System.currentTimeMillis();
        //签名方法：支持hmacmd5，hmacsha1和hmacsha256
        String signMethod = "hmacsha1";
        //控制台服务端订阅中消费组状态页客户端ID一栏将显示clientId参数。
        //建议使用机器UUID、MAC地址、IP等唯一标识等作为clientId。便于您区分识别不同的客户端。
        String clientId = UUID.randomUUID().toString();

        //UserName组装方法，请参见上一篇文档：AMQP客户端接入说明。
        String userName = clientId + "|authMode=aksign"
                + ",signMethod=" + signMethod
                + ",timestamp=" + timeStamp
                + ",authId=" + accessKey
//                + ",iotInstanceId=" + iotInstanceId //如果是购买的实例，需要传实例ID
                + ",consumerGroupId=" + consumerGroupId
                + "|";
        //password组装方法，请参见上一篇文档：AMQP客户端接入说明。
        String signContent = "authId=" + accessKey + "&timestamp=" + timeStamp;
        String password = doSign(signContent, accessSecret, signMethod);
        //按照qpid-jms的规范，组装连接URL。
        String connectionUrl = "failover:(amqps://278838153679110135.iot-amqp.cn-shanghai.aliyuncs.com:5671?amqp.idleTimeout=80000)"
                + "?failover.reconnectDelay=30";

        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("connectionfactory.SBCF", connectionUrl);
        hashtable.put("queue.QUEUE", "default");
        hashtable.put(Context.INITIAL_CONTEXT_FACTORY, "org.apache.qpid.jms.jndi.JmsInitialContextFactory");
        Context context = new InitialContext(hashtable);
        ConnectionFactory cf = (ConnectionFactory) context.lookup("SBCF");
        Destination queue = (Destination) context.lookup("QUEUE");
        // Create Connection
        Connection connection = cf.createConnection(userName, password);
        ((JmsConnection) connection).addConnectionListener(myJmsConnectionListener);
        // Create Session
        // Session.CLIENT_ACKNOWLEDGE: 收到消息后，需要手动调用message.acknowledge()
        // Session.AUTO_ACKNOWLEDGE: SDK自动ACK（推荐）
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        connection.start();
        // Create Receiver Link
        MessageConsumer consumer = session.createConsumer(queue);
        consumer.setMessageListener(messageListener);
    }
}