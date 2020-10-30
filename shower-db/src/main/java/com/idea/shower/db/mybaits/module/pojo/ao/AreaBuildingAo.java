package com.idea.shower.db.mybaits.module.pojo.ao;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ASUS
 */
@Data
public class AreaBuildingAo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String name;

    private String code;

    private Long areaId;
}

