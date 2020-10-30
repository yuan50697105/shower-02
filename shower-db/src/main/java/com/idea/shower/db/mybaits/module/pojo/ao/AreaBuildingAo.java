package com.idea.shower.db.mybaits.module.pojo.ao;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.idea.shower.db.mybaits.module.pojo.AreaBuilding;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ASUS
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AreaBuildingAo extends AreaBuilding implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String name;

    private String code;

    private Long areaId;

    private String areaName;
}

