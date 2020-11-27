package com.idea.shower.app.device.service.impl;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.idea.shower.app.device.client.WxRetrofitClient;
import com.idea.shower.app.device.converter.MessageBodyConverter;
import com.idea.shower.app.device.service.DeviceReceiveService;
import com.idea.shower.commons.constants.EquipmentOperationConstant;
import com.idea.shower.commons.exception.ResultException;
import com.idea.shower.commons.pojo.SubscribeMessageBody;
import com.idea.shower.commons.pojo.WxUseOrderRequest;
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
        JSONArray objects = JSONUtil.parseArray(content);
        messageBody.withWorkingStatus(objects.getStr(0));
        messageBody.withOrderNo(objects.getStr(1));
        messageBody.withWorkingTime(objects.getStr(2));
        messageBody.withWarmAirOnTime(objects.getStr(3));
        messageBody.withDoorStatus(objects.getStr(4));
        messageBody.withShowerValveStatus(objects.getStr(5));
        messageBody.withFlushingWaterValveStatus(objects.getStr(6));
        messageBody.withWarmAirCondition(objects.getStr(7));
        messageBody.withVentilatorStatus(objects.getStr(8));
        messageBody.withSerial1Status(objects.getStr(9));
        messageBody.withSerial2Status(objects.getStr(10));
        SubscribeMessage subscribeMessage = messageBodyConverter.convert(messageBody);
        subscribeMessageDao.save(subscribeMessage);

    }

    @Override
    public void timing5Min(String productKey, String deviceName, String messageId, String content) {
        log.info("当前方法DeviceReceiveServiceImpl.timing5Min");
//        {经度,纬度,工作状态,订单,工作时间,暖风开启时间,门状态,淋浴水阀状态,冲洗水阀状态,暖风状态,换气扇状态,串口1状态,串口2状态,是否有人状态}
        SubscribeMessageBody messageBody = SubscribeMessageBody.builder().productKey(productKey).deviceName(deviceName).messageId(messageId).operating("timing5Min").build();
        JSONArray objects = JSONUtil.parseArray(content);
        messageBody.withWarmAirOnTime(objects.getStr(0));
        messageBody.withShowerValveStatus(objects.getStr(1));
        messageBody.withFlushingWaterValveStatus(objects.getStr(2));
        messageBody.withWarmAirCondition(objects.getStr(3));
        messageBody.withVentilatorStatus(objects.getStr(4));
        messageBody.withSerial1Status(objects.getStr(5));
        messageBody.withSerial2Status(objects.getStr(6));
        SubscribeMessage subscribeMessage = messageBodyConverter.convert(messageBody);
        subscribeMessageDao.save(subscribeMessage);
    }

    @Override
    public void response(String productKey, String deviceName, String messageId, String content) {
        log.info("当前方法DeviceReceiveServiceImpl.response");
//        {经度,纬度,工作状态,订单,工作时间,暖风开启时间,门状态,淋浴水阀状态,冲洗水阀状态,暖风状态,换气扇状态,串口1状态,串口2状态,是否有人状态}
        SubscribeMessageBody messageBody = SubscribeMessageBody.builder().productKey(productKey).deviceName(deviceName).messageId(messageId).operating("response").build();
        JSONArray objects = JSONUtil.parseArray(content);
        messageBody.withLongitude(objects.getStr(0));
        messageBody.withLatitude(objects.getStr(1));
        messageBody.withWorkingStatus(objects.getStr(2));
        messageBody.withOrderNo(objects.getStr(3));
        messageBody.withWorkingTime(objects.getStr(4));
        messageBody.withWarmAirOnTime(objects.getStr(5));
        messageBody.withDoorStatus(objects.getStr(6));
        messageBody.withShowerValveStatus(objects.getStr(7));
        messageBody.withFlushingWaterValveStatus(objects.getStr(8));
        messageBody.withWarmAirCondition(objects.getStr(9));
        messageBody.withVentilatorStatus(objects.getStr(10));
        messageBody.withSerial1Status(objects.getStr(11));
        messageBody.withSerial2Status(objects.getStr(12));
        SubscribeMessage subscribeMessage = messageBodyConverter.convert(messageBody);
        subscribeMessageDao.save(subscribeMessage);
        List<SubscribeMessage> subscribeMessages = subscribeMessageDao.getByOrderNo(subscribeMessage.getOrderNo());
        Optional<DeviceOrder> deviceOrderOptional = deviceOrderDao.getByOrderNoOpt(subscribeMessage.getOrderNo());
        if (deviceOrderOptional.isPresent()) {
            DeviceOrder deviceOrder = deviceOrderOptional.get();
            if (deviceOrder.getStatus().equals(OrderInfoConstants.OrderStatus.USING)) {
                if ("0".equals(subscribeMessage.getWorkingStatus())) {
                    WxUseOrderRequest request = new WxUseOrderRequest();
                    request.setOrderNo(subscribeMessage.getOrderNo());
                    request.setDeviceCode(deviceOrder.getDeviceCode());
                    request.setOpenId(deviceOrder.getOpenId());
                    wxRetrofitClient.endOrder(request);
                }
            }
        }
    }

}