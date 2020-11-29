package com.idea.shower.app.device.converter;

import com.idea.shower.commons.pojo.SubscribeMessageBody;
import com.idea.shower.db.mybaits.module.pojo.SubscribeMessage;
import org.mapstruct.Mapper;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-25 20:29
 */
@Mapper(componentModel = "spring")
public interface MessageBodyConverter {

    SubscribeMessage convert(SubscribeMessageBody messageBody);
}
