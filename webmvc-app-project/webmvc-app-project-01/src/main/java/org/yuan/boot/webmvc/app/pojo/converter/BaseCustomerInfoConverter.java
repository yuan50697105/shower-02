package org.yuan.boot.webmvc.app.pojo.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfo;
import org.yuan.boot.webmvc.app.pojo.vo.BaseCustomerInfoVo;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-05 19:32
 */
@Mapper(componentModel = "spring")
public interface BaseCustomerInfoConverter {
    BaseCustomerInfo convert(BaseCustomerInfoVo baseCustomerInfoVo);

    List<BaseCustomerInfo> convert(List<BaseCustomerInfoVo> baseCustomerInfoVos);

    BaseCustomerInfo[] convert(BaseCustomerInfoVo[] baseCustomerInfoVos);
}
