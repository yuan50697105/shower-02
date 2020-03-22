package com.idea.shower.amqp.producer.impl;

import com.idea.shower.amqp.pojo.WxOrderDeviceProducerDTO;
import com.idea.shower.amqp.producer.WxOrderDeviceProducer;
import org.springframework.stereotype.Component;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-18 21:37
 */
@Component
public class WxOrderDeviceProducerImpl extends BaseProducerImpl<WxOrderDeviceProducerDTO> implements WxOrderDeviceProducer {
}