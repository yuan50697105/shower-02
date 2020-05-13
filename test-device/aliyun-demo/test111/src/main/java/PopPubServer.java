import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.iot.model.v20180120.PubRequest;
import com.aliyuncs.iot.model.v20180120.PubResponse;
import com.aliyuncs.profile.DefaultProfile;
import org.eclipse.paho.client.mqttv3.internal.websocket.Base64;

public class PopPubServer {

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
}
