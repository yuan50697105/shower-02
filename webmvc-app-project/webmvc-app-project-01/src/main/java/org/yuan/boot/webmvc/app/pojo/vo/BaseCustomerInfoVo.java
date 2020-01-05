package org.yuan.boot.webmvc.app.pojo.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfo;

import javax.validation.constraints.NotEmpty;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-05 19:22
 */
@Data
public final class BaseCustomerInfoVo {
    private Long id;
    @NotEmpty
    private String actualName;
    @NotEmpty
    private String contactAddress;
    @NotEmpty
    private String contactNumber;
    @NotEmpty
    private String identityNumber;
}