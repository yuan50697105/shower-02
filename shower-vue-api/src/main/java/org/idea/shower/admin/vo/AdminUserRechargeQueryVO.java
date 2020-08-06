package org.idea.shower.admin.vo;

import java.util.Date;

/**
 * @program: shower
 * @description:
 * @author: yuanez
 * @create: 2019-10-24 11:19
 **/

public class AdminUserRechargeQueryVO {
    private String addDateStart;
    private String addDateEnd;
    private Integer brandId;

    public String getAddDateStart() {
        return addDateStart;
    }

    public void setAddDateStart(String addDateStart) {
        this.addDateStart = addDateStart;
    }

    public String getAddDateEnd() {
        return addDateEnd;
    }

    public void setAddDateEnd(String addDateEnd) {
        this.addDateEnd = addDateEnd;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
}
