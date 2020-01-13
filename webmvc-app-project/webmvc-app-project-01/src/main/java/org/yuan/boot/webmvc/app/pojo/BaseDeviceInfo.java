package org.yuan.boot.webmvc.app.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @program: learning-demo-02
 * @description: 设备信息
 * @author: yuanez
 * @create: 2020-01-13 14:52
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class BaseDeviceInfo extends BaseEntity<BaseDeviceInfo> implements Serializable {
    private Long id;
    private String code;
    private String name;
    private String address;
    private String point;
    private Integer enabled;
}
