package com.idea.shower.app.wx;

import com.idea.shower.app.db.module.constants.OrderInfoConstants;
import com.idea.shower.app.db.module.mapper.CustomerInfoMapper;
import com.idea.shower.app.db.module.pojo.CustomerInfo;
import com.idea.shower.app.db.module.pojo.CustomerInfoExample;
import com.idea.shower.app.wx.mp.pojo.WxAddOrderRequest;
import com.idea.shower.app.wx.mp.service.WxOrderInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = ShowerWxApplication.class)
public class ShowerWxApplicationTests {
    @Autowired
    private ApplicationContext context;

    @Test
    void t1() {
        CustomerInfoMapper customerInfoMapper = context.getBean(CustomerInfoMapper.class);
        long count = customerInfoMapper.countByExample(new CustomerInfoExample());
        System.out.println("count = " + count);
    }

    @Test
    @Transactional
    @Rollback(false)
    void t2() {
        CustomerInfoMapper customerInfoMapper = context.getBean(CustomerInfoMapper.class);
        int insert = customerInfoMapper.insert(new CustomerInfo());
        System.out.println("insert = " + insert);
    }

    @Test
    @Transactional(rollbackFor = Exception.class)
    @Rollback(value = false)
    void tAddOrder() {
        String openId = "adasd";
        String rangeCode = "asdasd";
        String deviceCode = "A001";
//        CustomerInfoDao customerInfoDao = context.getBean(CustomerInfoDao.class);
//        CustomerInfo customerInfo = new CustomerInfo();
//        customerInfo.setOpenId(openId);
//        customerInfoDao.save(customerInfo);

//        PriceInfoDao priceInfoDao = context.getBean(PriceInfoDao.class);
//        PriceInfo priceInfo = new PriceInfo();
//        priceInfo.setCode(UUID.randomUUID().toString());
//        priceInfo.setRangeCode(rangeCode);
//        priceInfo.setTimePrice(new BigDecimal("100"));
//        priceInfo.setWaterPrice(new BigDecimal("100"));
//        priceInfoDao.save(priceInfo);

        WxOrderInfoService orderInfoService = context.getBean(WxOrderInfoService.class);
        WxAddOrderRequest wxAddOrderRequest = new WxAddOrderRequest();
        wxAddOrderRequest.setDeviceCode(deviceCode);
//        wxOrderInfo.setDeviceId(1111L);
        wxAddOrderRequest.setOpenId(openId);
        wxAddOrderRequest.setType(OrderInfoConstants.OrderType.RESERVATION);
        orderInfoService.addOrder(wxAddOrderRequest);
    }
}
