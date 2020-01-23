package org.yuan.boot.shower.admin.pojo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-22 15:58
 */
@Data
public class DeviceInfoVO {
    @NotEmpty(groups = {Update.class})
    private Long id;
    @NotEmpty(groups = {Save.class})
    private String deviceCode;
    @NotEmpty(groups = {Update.class, Save.class})
    private String point;
    @NotEmpty(groups = {Save.class, Update.class})
    private Integer type;

    public interface Save {
    }

    public interface Update {
    }

}