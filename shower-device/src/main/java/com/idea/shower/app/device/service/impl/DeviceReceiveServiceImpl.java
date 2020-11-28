package com.idea.shower.app.device.service.impl;

import com.idea.shower.app.device.client.WxRetrofitClient;
import com.idea.shower.app.device.converter.MessageBodyConverter;
import com.idea.shower.app.device.service.DeviceReceiveService;
import com.idea.shower.commons.constants.EquipmentOperationConstant;
import com.idea.shower.commons.exception.ResultException;
import com.idea.shower.commons.pojo.SubscribeMessageBody;
import com.idea.shower.commons.pojo.WxEndOrderRequest;
import com.idea.shower.db.mybaits.module.constants.OrderInfoConstants;
import com.idea.shower.db.mybaits.module.dao.DeviceOrderDao;
import com.idea.shower.db.mybaits.module.dao.SubscribeMessageDao;
import com.idea.shower.db.mybaits.module.mapper.DeviceInfoMapper;
import com.idea.shower.db.mybaits.module.mapper.DeviceRunningLogMapper;
import com.idea.shower.db.mybaits.module.pojo.DeviceOrder;
import com.idea.shower.db.mybaits.module.pojo.SubscribeMessage;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-23 21:26
 */
@Service
@Slf4j
public class DeviceReceiveServiceImpl implements DeviceReceiveService {
    @Autowired
    private DeviceRunningLogMapper deviceRunningLogMapper;
    @Autowired
    private DeviceInfoMapper deviceInfoMapper;
    @Autowired
    private SubscribeMessageDao subscribeMessageDao;
    @Autowired
    private DeviceOrderDao deviceOrderDao;
    @Autowired
    private MessageBodyConverter messageBodyConverter;
    @Autowired
    private WxRetrofitClient wxRetrofitClient;

    @Override
    public void receiveData(String productKey, String deviceName, String operating, String messageId, String content) throws ResultException {
        switch (operating) {
            case EquipmentOperationConstant.RESPONSE:
                response(productKey, deviceName, messageId, content);
                break;
            case EquipmentOperationConstant.WORK_15_SEC:
                work15Sec(productKey, deviceName, messageId, content);
                break;
            case EquipmentOperationConstant.TIMING_5_MIN:
                timing5Min(productKey, deviceName, messageId, content);
                break;
            default:
                throw new ResultException(ResultUtils.dataParamsError("操作操作类型"));

        }
    }

    @Override
    public void work15Sec(String productKey, String deviceName, String messageId, String content) {
        log.info("当前方法DeviceReceiveServiceImpl.work15Sec");
//        {经度,纬度,工作状态,订单,工作时间,暖风开启时间,门状态,淋浴水阀状态,冲洗水阀状态,暖风状态,换气扇状态,串口1状态,串口2状态,是否有人状态}
        SubscribeMessageBody messageBody = SubscribeMessageBody.builder().productKey(productKey).deviceName(deviceName).messageId(messageId).operating("work15Sec").build();
//        JSONArray objects = JSONUtil.parseArray(content);
        String[] strings = getStrings(content);
        messageBody.setWorkingStatus(strings[0]);
        messageBody.setOrderNo(strings[1]);
        messageBody.setWorkingTime(strings[2]);
        messageBody.setWarmAirOnTime(strings[3]);
        messageBody.setDoorStatus(strings[4]);
        messageBody.setShowerValveStatus(strings[5]);
        messageBody.setFlushingWaterValveStatus(strings[6]);
        messageBody.setWarmAirCondition(strings[7]);
        messageBody.setVentilatorStatus(strings[8]);
        messageBody.setSerial1Status(strings[9]);
        messageBody.setSerial2Status(strings[10]);
        SubscribeMessage subscribeMessage = messageBodyConverter.convert(messageBody);
        subscribeMessageDao.save(subscribeMessage);

    }

    @Override
    public void timing5Min(String productKey, String deviceName, String messageId, String content) {
        log.info("当前方法DeviceReceiveServiceImpl.timing5Min");
//        {经度,纬度,工作状态,订单,工作时间,暖风开启时间,门状态,淋浴水阀状态,冲洗水阀状态,暖风状态,换气扇状态,串口1状态,串口2状态,是否有人状态}
        SubscribeMessageBody messageBody = SubscribeMessageBody.builder().productKey(productKey).deviceName(deviceName).messageId(messageId).operating("timing5Min").build();
//        JSONArray objects = JSONUtil.parseArray(content);
        String[] strings = getStrings(content);
        messageBody.setWarmAirOnTime(strings[0]);
        messageBody.setShowerValveStatus(strings[1]);
        messageBody.setFlushingWaterValveStatus(strings[2]);
        messageBody.setWarmAirCondition(strings[3]);
        messageBody.setVentilatorStatus(strings[4]);
        messageBody.setSerial1Status(strings[5]);
        messageBody.setSerial2Status(strings[6]);
        SubscribeMessage subscribeMessage = messageBodyConverter.convert(messageBody);
        subscribeMessageDao.save(subscribeMessage);
    }

    @Override
    public void response(String productKey, String deviceName, String messageId, String content) {
        log.info("当前方法DeviceReceiveServiceImpl.response");
//        {经度,纬度,工作状态,订单,工作时间,暖风开启时间,门状态,淋浴水阀状态,冲洗水阀状态,暖风状态,换气扇状态,串口1状态,串口2状态,是否有人状态}
        SubscribeMessageBody messageBody = SubscribeMessageBody.builder().productKey(productKey).deviceName(deviceName).messageId(messageId).operating("response").build();
//        JSONArray objects = JSONUtil.parseArray(content);
        String[] strings = getStrings(content);
        messageBody.setLongitude(strings[0]);
        messageBody.setLatitude(strings[1]);
        messageBody.setWorkingStatus(strings[2]);
        messageBody.setOrderNo(strings[3]);
        messageBody.setWorkingTime(strings[4]);
        messageBody.setWarmAirOnTime(strings[5]);
        messageBody.setDoorStatus(strings[6]);
        messageBody.setShowerValveStatus(strings[7]);
        messageBody.setFlushingWaterValveStatus(strings[8]);
        messageBody.setWarmAirCondition(strings[9]);
        messageBody.setVentilatorStatus(strings[10]);
        messageBody.setSerial1Status(strings[11]);
        messageBody.setSerial2Status(strings[12]);
        SubscribeMessage subscribeMessage = messageBodyConverter.convert(messageBody);
        subscribeMessageDao.save(subscribeMessage);
        List<SubscribeMessage> subscribeMessages = subscribeMessageDao.getByOrderNo(subscribeMessage.getOrderNo());
        Optional<DeviceOrder> deviceOrderOptional = deviceOrderDao.getByOrderNoOpt(subscribeMessage.getOrderNo());
        if (deviceOrderOptional.isPresent()) {
            DeviceOrder deviceOrder = deviceOrderOptional.get();
            if (deviceOrder.getStatus().equals(OrderInfoConstants.OrderStatus.USING)) {
                if ("0".equals(subscribeMessage.getWorkingStatus())) {
                    WxEndOrderRequest request = new WxEndOrderRequest();
                    request.setOrderNo(subscribeMessage.getOrderNo());
                    request.setOpenId(deviceOrder.getOpenId());
                    wxRetrofitClient.endOrder(request);
                }
            }
        }
    }


    private String[] getStrings(String content) {
        content = content.replace("\\{|\\}", "");
        return content.split(",");
    }
}