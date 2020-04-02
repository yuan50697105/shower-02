package com.idea.shower.app.db;

import cn.hutool.core.lang.Snowflake;
import com.idea.shower.app.db.module.constants.PriceInfoConstants;
import com.idea.shower.app.db.module.mapper.DeviceInfoMapper;
import com.idea.shower.app.db.module.mapper.PriceInfoMapper;
import com.idea.shower.app.db.module.pojo.DeviceInfo;
import com.idea.shower.app.db.module.pojo.DeviceInfoExample;
import com.idea.shower.app.db.module.pojo.PriceInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
public class ShowerDbApplicationTests {
    @Autowired
    private DeviceInfoMapper deviceInfoMapper;
    @Autowired
    private PriceInfoMapper priceInfoMapper;
    @Autowired
    private Snowflake snowflake;

    @Test
    @Transactional
    @Rollback(value = false)
    void addPrice() {

        List<DeviceInfo> deviceInfos = deviceInfoMapper.selectByExample(new DeviceInfoExample());
        List<String> list = deviceInfos.stream().map(DeviceInfo::getPriceCode).collect(Collectors.toList());
        list.stream().map(s -> {
            String nextIdStr = snowflake.nextIdStr();
            PriceInfo priceInfo = new PriceInfo();
            priceInfo.setCode(nextIdStr);
            priceInfo.setType(PriceInfoConstants.PriceType.STARTING_PRICE);
            priceInfo.setPriceCode(s);
            priceInfo.setTimePrice(new BigDecimal("6.0"));
            priceInfo.setTimeInterval(30D);
            priceInfo.setTimeUnit(PriceInfoConstants.PriceTimeUnit.MINUTE);
            priceInfo.setWaterPrice(new BigDecimal("1.0"));
            priceInfo.setWaterInterval(5D);
            priceInfo.setWaterUnit(PriceInfoConstants.PriceWaterUnit.RISE);
            priceInfo.setEnabled(1);

            return priceInfo;
        }).forEach(priceInfoMapper::insert);
    }

    @Test
    void addPrice2() {
        String nextIdStr = snowflake.nextIdStr();
        PriceInfo priceInfo = new PriceInfo();
        priceInfo.setCode(nextIdStr);
        priceInfo.setType(PriceInfoConstants.PriceType.STARTING_PRICE);
        priceInfo.setPriceCode("A1234");
        priceInfo.setTimePrice(new BigDecimal("6.0"));
        priceInfo.setTimeInterval(30D);
        priceInfo.setTimeUnit(PriceInfoConstants.PriceTimeUnit.MINUTE);
        priceInfo.setWaterPrice(new BigDecimal("1.0"));
        priceInfo.setWaterInterval(5D);
        priceInfo.setWaterUnit(PriceInfoConstants.PriceWaterUnit.RISE);
        priceInfo.setEnabled(1);
        priceInfoMapper.insert(priceInfo);
    }
}
